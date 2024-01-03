
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Tic_Tac_Toe extends Frame implements ActionListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String s="",s1="1",s2="2",s3="3",s4="4",s5="5",s6="6",s7="7",s8="8",s9="9";
    int i=0,i1=0,i2=0,i3=0,i4=0,i5=0,i6=0,i7=0,i8=0,i9=0;
    {
        JOptionPane.showMessageDialog(null, "Player 1 is color RED, Player 2 is color BLUE.");

    }

    public Tic_Tac_Toe(){
        addWindowListener ( new WindowAdapter(){
            public void windowClosing( WindowEvent e){

                dispose();
            }

        });
        setSize(500,500);
        setTitle("Tic_Tac_Toe(Player1 Vs Player2)");
        setLayout(null);
        setVisible(true);
        setLayout(new GridLayout(3,3,1,1));
        setVisible(true);
        b1=new Button("b1");
        b2=new Button("b2");
        b3=new Button("b3");
        b4=(new Button("b4"));
        b5=(new Button("b5"));
        b6=(new Button("b6"));
        b7=(new Button("b7"));
        b8=(new Button("b8"));
        b9=(new Button("b9"));
        add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8); add(b9);
        b1.setBackground(Color.black);
        b1.setForeground(Color.orange);
        b2.setBackground(Color.black);
        b2.setForeground(Color.orange);
        b3.setBackground(Color.black);
        b3.setForeground(Color.orange);
        b4.setBackground(Color.black);
        b4.setForeground(Color.orange);
        b5.setBackground(Color.black);
        b5.setForeground(Color.orange);
        b6.setBackground(Color.black);
        b6.setForeground(Color.orange);
        b7.setBackground(Color.black);
        b7.setForeground(Color.orange);
        b8.setBackground(Color.black);
        b8.setForeground(Color.orange);
        b9.setBackground(Color.black);
        b9.setForeground(Color.orange);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b7.setBounds(40,150,50,40);
        b8.setBounds(110,150,50,40);
        b9.setBounds(180,150,50,40);
        b4.setBounds(40,200,50,40);
        b5.setBounds(110,200,50,40);
        b6.setBounds(180,200,50,40);
        b1.setBounds(40,250,50,40);
        b2.setBounds(110,250,50,40);
        b3.setBounds(180,250,50,40);}
    public void actionPerformed(ActionEvent e) {

        String str=e.getActionCommand();

        if(s.equals("")){

            for(;i<9;){

                if(i%2==0 && str.equals("b1") && i1==0){
                    b1.setBackground(Color.red);
                    ++i;
                    i1=1;
                    s1="red";
                    break;
                }
                else if(i%2==0 && str.equals("b2") && i2==0){
                    b2.setBackground(Color.red);
                    ++i;
                    i2=2;
                    s2="red";
                    break;
                }
                else if(i%2==0 && str.equals("b3") && i3==0){
                    b3.setBackground(Color.red);
                    ++i;
                    i3=3;
                    s3="red";
                    break;
                }
                else if(i%2==0 && str.equals("b4") && i4==0){
                    b4.setBackground(Color.red);
                    ++i;
                    i4=4;
                    s4="red";
                    break;
                }
                else if(i%2==0 && str.equals("b5") && i5==0){
                    b5.setBackground(Color.red);
                    ++i;
                    i5=5;
                    s5="red";
                    break;
                }
                else if(i%2==0 && str.equals("b6") && i6==0){
                    b6.setBackground(Color.red);
                    ++i;
                    i6=6;
                    s6="red";
                    break;
                }
                else if(i%2==0 && str.equals("b7") && i7==0){
                    b7.setBackground(Color.red);
                    ++i;
                    i7=7;
                    s7="red";
                    break;
                }
                else if(i%2==0 && str.equals("b8") && i8==0){
                    b8.setBackground(Color.red);
                    ++i;
                    i8=8;
                    s8="red";
                    break;
                }
                else if(i%2==0 && str.equals("b9") && i9==0){
                    b9.setBackground(Color.red);
                    ++i;
                    i9=9;
                    s9="red";
                    break;
                }



                if(i%2!=0 && str.equals("b1") && i1==0){
                    b1.setBackground(Color.blue);
                    ++i;
                    i1=1;
                    s1="blue";
                    break;
                }
                else if(i%2!=0 && str.equals("b2") && i2==0){
                    b2.setBackground(Color.blue);
                    ++i;
                    i2=2;
                    s2="blue";
                    break;
                }
                else if(i%2!=0 && str.equals("b3") && i3==0){
                    b3.setBackground(Color.blue);
                    ++i;
                    i3=3;
                    s3="blue";
                    break;}
                else if(i%2!=0 && str.equals("b4") && i4==0){
                    b4.setBackground(Color.blue);
                    ++i;
                    i4=4;
                    s4="blue";
                    break;
                }
                else   if(i%2!=0 && str.equals("b5") && i5==0){
                    b5.setBackground(Color.blue);
                    ++i;
                    i5=5;
                    s5="blue";
                    break;
                }
                else   if(i%2!=0 && str.equals("b6") && i6==0){
                    b6.setBackground(Color.blue);
                    ++i;
                    i6=6;
                    s6="blue";
                    break;
                }
                else   if(i%2!=0 && str.equals("b7") && i7==0){
                    b7.setBackground(Color.blue);
                    ++i;
                    i7=7;
                    s7="blue";
                    break;
                }
                else   if(i%2!=0 && str.equals("b8") && i8==0){
                    b8.setBackground(Color.blue);
                    ++i;
                    i8=8;
                    s8="blue";
                    break;
                }
                else   if(i%2!=0 && str.equals("b9") && i9==0){
                    b9.setBackground(Color.blue);
                    ++i;
                    i9=9;
                    s9="blue";
                    break;
                }

            }

            if((s1.equals(s2) && s1.equals(s3)) || (s1.equals(s4) && s1.equals(s7)) ||  (s1.equals(s5) && s1.equals(s9))
                    || (s2.equals(s5) && s2.equals(s8)) ||  (s3.equals(s5) && s3.equals(s7)) ||
                    (s3.equals(s6) && s3.equals(s9)) ||  (s4.equals(s5) && s4.equals(s6)) ||
                    (s7.equals(s8) && s7.equals(s9))){

                if((s1 == "red" && s2 == "red" && s3 == "red" ) || (s1 == "red" && s4 == "red" && s7 == "red" ) ||
                        ( s1 == "red" && s5 == "red" && s9 == "red" ) || (s2 == "red" && s5 == "red" && s8 == "red" ) ||
                        (s3 == "red" && s5 == "red" && s7 == "red" ) || (s3 == "red" && s6 == "red" && s9 == "red" ) ||
                        (s4 == "red" && s5 == "red" && s6 == "red" ) || (s7 == "red" && s8 == "red" && s9 == "red" )) {

                    JOptionPane.showMessageDialog(null, "Player 1 wins!!!");
                }

                else if( (s1 != "red" && s2 != "red" && s3 != "red" ) || (s1 != "red" && s4 != "red" && s7 != "red" ) ||
                        ( s1 != "red" && s5 != "red" && s9 != "red" ) || (s2 != "red" && s5 != "red" && s8 != "red" ) ||
                        (s3 != "red" && s5 != "red" && s7 != "red" ) || (s3 != "red" && s6 != "red" && s9 != "red" ) ||
                        (s4 != "red" && s5 != "red" && s6 != "red" ) || (s7 != "red" && s8 != "red" && s9 != "red" )){

                        JOptionPane.showMessageDialog(null, "Player 2 wins!!!");
                }

                else {
                    JOptionPane.showMessageDialog(null, "Draw");
                }

                s="END";

            }

        }
    }
    public static void main(String[] args) {
        Tic_Tac_Toe n = new Tic_Tac_Toe();
    }
}



