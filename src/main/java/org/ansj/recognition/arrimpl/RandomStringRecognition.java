package org.ansj.recognition.arrimpl;

import org.ansj.domain.Term;
import org.ansj.domain.TermNatures;
import org.ansj.recognition.TermArrRecognition;
import org.ansj.util.Graph;
import org.ansj.util.TermUtil;

/**
 *
 * 识别随机字符串,例如uuid产生的字符串
 * @author shaojieyue
 * Created at 2019-05-29 21:07
 */
public class RandomStringRecognition implements TermArrRecognition {
    private static final long serialVersionUID = -1427092012931357123L;

    @Override
    public void recognition(Graph graph) {
        final Term[] terms = graph.terms;
        int length = terms.length;
        Term temp;
        for (int i = 0; i < length; i++) {
            temp = terms[i];
            if (temp == null) {
                continue;
            }
            //只处理字母和数字
            if (!(temp.termNatures() == TermNatures.M_ALB || temp.termNatures() == TermNatures.EN)) {
                continue;
            }

            Term to = temp.to();
            TermNatures currentNatures = temp.termNatures();
            int count = 1;
            //循环查找数字和字符连续交替出现的次数
            //因为随机字符串经过ansj分词后,都是以连续的数字和字母出现的,例如:12,ab,23,cd
            while (to != null){
                final TermNatures toNatures = to.termNatures();
                //保证字母和字符是交替出现
                if (currentNatures == TermNatures.M_ALB && toNatures == TermNatures.EN) {
                    currentNatures = toNatures;
                    to = to.to();
                    count++;
                } else if (currentNatures == TermNatures.EN && toNatures == TermNatures.M_ALB) {
                    currentNatures = toNatures;
                    to = to.to();
                    count++;
                } else {
                    break;
                }
            }
            //大于一个阀值的情况下才认为是随机串,该值设置大些,防止误判
            if (count > 3) {
                to = temp.to();
                StringBuilder nameBuilder = new StringBuilder(temp.getName());
                for (int j = 0; j < count-1; j++) {
                    nameBuilder.append(to.getName());
                    terms[to.getOffe()] = null ;
                    to = to.to();
                }
                Term term = new Term(nameBuilder.toString(),temp.getOffe(),TermNatures.ENM);
                //将新生成的term 和两端连接起来
                TermUtil.termLink(temp.from(), term);
                TermUtil.termLink(term, to);
                TermUtil.insertTermNum(terms, term);
            }
        }
    }
}
