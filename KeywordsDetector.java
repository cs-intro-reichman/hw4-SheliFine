public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    public static String lowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            // checks ASCII num to check if uppercase letter 
            // and adds 32 to make it lowercase, using ASCII.
            if (ch > 64 && ch < 91){
                ch += 32;
                str = str.substring(0, i) + (char) ch + str.substring(i + 1);
            } else {
                continue;
            }
        } 
        return str;
    }

    public static boolean contains(String str1, String str2) {
 
        if (str2.length() > str1.length()) {
            return false;
        }
        
        if (str2 == ""){
            return true;
        }

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                int j = 1;
                while (j < str2.length() && str1.charAt(i + j) == str2.charAt(j)) {
                    j++;
                }
                if (j == str2.length()) {
                    return true;
                }
            }
        }
        return false;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                String temp = lowerCase(sentences[i]);
                keywords[j] = lowerCase(keywords[j]);                
                if (contains(temp, keywords[j])){
                    System.out.println(sentences[i]);
                    break;
                }  
            }
        }
    }
}