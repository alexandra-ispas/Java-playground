package hackerrank;

public class DecodeHuffman {

    public static void decode (Node root, String code) {
        String result = "";
        Node it = root;
        int i = 0;

        while(i < code.length ()) {
            it = (code.charAt ( i ) == '1') ? it.right : it.left;
            i++;

            if(it.left == null && it.right == null) {
                result += it.data;
                it = root;
            }
        }
        System.out.println (result);
    }

    public class Node {
        int frequency;
        char data;
        Node left;
        Node right;
    }
}
