import java.util.Scanner;

public class Demo9 {
    
    private static final Scanner scanner1 = new Scanner(System.in);

    public static void main(String[] args) {

        String redColour="\033[031m";
        String resetColour="\033[030m";
        String green="\033[032m";
        String blue="\033[034m";

        String status1;
        String status2;
        String status3;
        String avgstring;
                
        String firstline="-".repeat(20)+"|";
                


        System.out.print("Enter your Name : "); 
        String name=scanner1.nextLine();
        String nameLength = name.strip();

        if(nameLength.length()>0)System.out.printf("Name=%s\n",name);
        else {
            System.out.printf("%sInvalid Name%s\n",redColour,resetColour);
            return ;
        }
        

            System.out.print("Enter your Age :");
            int age=scanner1.nextInt();
            if (18>age&&age>10)System.out.println("Age ="+age);
            else 
            {
                System.out.printf("%sInvalid Age%s\n",redColour,resetColour);
                return;
            }
            
            
              System.out.print("Enter your Subject1 :");
                String subject1=scanner1.next();
                boolean sub1=subject1.startsWith("SE-");
                if (sub1)System.out.printf("subject =%s\n",subject1);
                else{
                     System.out.printf("%sInvalid Subject %s\n",redColour,resetColour);
                    return;
                }
            
                    System.out.print("Enter your mark1 :");
                    double mark1=scanner1.nextDouble();
                    
                    
                    if(100>mark1&&mark1>75){ status1 = green+" creadit pass"+resetColour;//System.out.printf("%s%s,%s\n",subject1,mark1,"Credit pass");
                    }else if(55<mark1&&mark1<75){status1 = blue+" pass"+resetColour;//System.out.printf("%s,%s\n",mark1," pass");
                    }else if (mark1<55){ status1 = redColour+" Fail"+resetColour; //System.out.printf("%s,%s\n",mark1,"Fail"); 
                    
                    }else{
                        System.out.printf("%sInvalid marks %s\n",redColour,resetColour);
                        return;
                    }
                
                    System.out.print("Enter your Subject2 :");
                    String subject2=scanner1.next();
                    boolean sub2=subject2.startsWith("SE-");
                    if (sub2)System.out.printf("subject =%s\n",subject2);
                     else{
                     System.out.printf("%sInvalid Subject %s\n",redColour,resetColour);
                    return;
                    }
                    System.out.print("Enter your mark2 :");
                    double mark2=scanner1.nextDouble();
                    
                    
                    if (100>=mark2&&mark2>75)  status2 = green+" creadit pass"+resetColour;
                    else if(55<mark2&&mark1<75) status2 = blue+" pass"+resetColour;//System.out.printf("%s,%s\n",mark2," pass");
                    else if (mark2<55&&mark2>=0) status2 =redColour+" Fail"+resetColour;// System.out.printf("%s,%s\n",mark2,"Fail");  
                    
                    else{
                       System.out.printf("%sInvalid marks %s\n",redColour,resetColour);
                    return;

                    } 

                    System.out.print("Enter your Subject3 :");
                    String subject3=scanner1.next();
                    boolean sub3=subject3.startsWith("SE-");
                    if (sub3)System.out.printf("subject =%s\n",subject3);
                     else{
                     System.out.printf("%sInvalid Subject %s\n",redColour,resetColour);
                    return;
                    }
                    
                    System.out.print("Enter your mark3 :");
                    double mark3=scanner1.nextDouble();
                    
                    {
                    if (100>mark3&&mark3>=75) status3 = green+" creadit pass"+resetColour; //System.out.printf("%s%s,%s\n",subject1,mark3,"Credit pass");
                    else if(55<=mark3&&mark3<75)status3 = blue+" pass"+resetColour;//System.out.printf("%s,%s\n",mark3," pass");
                    else if(0<mark3&&mark3<55) status3 = redColour+" Fail"+resetColour; //System.out.printf("%s,%s\n",mark3,"Fail");  
                
                    else{
                       System.out.printf("%sInvalid marks %s\n",redColour,resetColour);
                    return;

                    } 
                


                } 


                    double total=(mark1+mark2+mark3);
                    double avg=total/3;
                    if(100>avg&&avg>75)avgstring=green+" creadit pass"+resetColour;
                    else if(75>avg && avg>55)avgstring=blue+" pass"+resetColour;
                    else avgstring=redColour+" Fail"+resetColour; 

                    System.out.printf("|%s%1$s%1$s\n",firstline);

                    System.out.printf("|Name=%s\n",name);
                    System.out.printf("|AGE=%s\n",age);
                    System.out.printf("|Status=%s\n",avgstring);
                    System.out.printf("|Total=%s|AVG=%-60.2f\n",total,avg);
                   
                    
                    
                    System.out.printf("|%s%1$s%1$s\n",firstline);
                    System.out.printf("|%-20s|%-20s|%-20s|\n","Subject","Marks","Status");
                    System.out.printf("|%s%1$s%1$s\n",firstline);
                    System.out.printf("|%-20s|%-20.2f|%-20s|\n",subject1,mark1,status1);
                    System.out.printf("|%-20s|%-20.2f|%-20s|\n",subject2,mark2,status2);
                    System.out.printf("|%-20s|%-20.2f|%-20s|\n",subject3,mark3,status3);
                    System.out.printf("|%s%1$s%1$s\n",firstline);
                

              
            }
        

            
        }
              
          
       
               
        
    

        


        


        
    
    

