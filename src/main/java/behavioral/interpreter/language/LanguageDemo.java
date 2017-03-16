package behavioral.interpreter.language;

/**
 * Created by jarydu on 3/15/17.
 */
public class LanguageDemo {

    public static void main(String[] args) {

        LangContext chinese = new ChineseContext("大家好");
        LangContext french = new FrenchContext("Louis Vuitton");
        LangContext english = new EnglishContext("iMac");

        LangExp frenchExp = new FrenchExp();
        String f1 = frenchExp.interpret(chinese);
        System.out.println(String.format("Translate Chinese[%s] to French[%s]", chinese.getContext(), f1));

        LangExp englishExp = new EnglishExp();
        String e1 = englishExp.interpret(french);
        System.out.println(String.format("Translate French[%s] to English[%s]", french.getContext(), e1));

        LangExp chineseExp = new ChineseExp();
        String c1 = chineseExp.interpret(english);
        System.out.println(String.format("Translate English[%s] to Chinese[%s]", english.getContext(), c1));
    }
}
