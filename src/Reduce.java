public class Reduce {

    public static void main(String[] args) {

        int cur=100, ans=0;
        while(cur > 0) {
            if(cur % 2 == 0) cur /= 2;
            else cur--;

            ans++;
        }

        System.out.println(ans);
    }
}
