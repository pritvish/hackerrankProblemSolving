public class DellReverseDelhi {
    public static void main(String[] args) {
        String word = "Delhi";

        char[] ch = new char[word.length()];
        ch = word.toCharArray();

        char[] newch = new char[word.length()];
        int index = 0;

        for (int i=0; i<word.length(); i++) {
            if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U') {
                newch[i] = ch[i];
            }
        }

        for (int i = word.length()-1; i>=0; i--) {
            if(newch[i]!=' ') {

            } else {
                if(index < word.length()) {
                    if (!(ch[index]=='a'||ch[index]=='A'||ch[index]=='e'||ch[index]=='E'||ch[index]=='i'||ch[index]=='I'||ch[index]=='o'||ch[index]=='O'||ch[index]=='u'||ch[index]=='U')) {
                        newch[i] = ch[index];
                    } else {
                        newch[i] = ch[index+1];
                        index = index+2;
                    }
                }
            }
        }

        System.out.println(newch.toString());

    }
}
