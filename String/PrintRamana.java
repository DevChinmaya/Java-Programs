public class PrintRamana {
    public static void main(String[] args) {
        String s="AskyEvkIplyOflyUhp";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                for(int j=i; j<s.length(); j++){
                    System.out.print(s.charAt(j));
                    for(int k=j+1; k<s.length(); k++){
                        char c1=s.charAt(k);
                        if(c1 == 'A' || c1=='E' || c1=='I' || c1=='O' || c1=='U'){
                            break;
                        }else{
                            System.out.print(c1);
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}


