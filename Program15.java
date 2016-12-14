package program.pkg15;
 class Rupees
    {  
        int r=2000;  
    }  
 class BanRupees extends Rupees
    {  
        int r=1000;  
        void Show()
            {  
                System.out.println(super.r); 
                System.out.println(r);
            }  
public static void main(String[] args) 
    {
        new BanRupees().Show();
    }
    
}
