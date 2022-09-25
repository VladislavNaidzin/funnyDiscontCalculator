import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DiscontCalculator extends JFrame {


    JTextField  name_user,CostWihtoutDiscont_user,Discont_user, itog_user;
    public DiscontCalculator()
    {super("Калькулятор скидок");
    super.setBounds(400,100,400,175);
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container buttonsandtext = super.getContentPane();
        buttonsandtext.setLayout( new GridLayout(5,2,10,5));

        JLabel name = new JLabel("Введите имя:");
        name_user=new JTextField("",1);

        JLabel CostWihtoutDiscont = new JLabel("Введите цену без скидки:");
        CostWihtoutDiscont_user=new JTextField("",1);

        JLabel Discont = new JLabel("Введите скидку:");
        Discont_user=new JTextField("%",1);

        JLabel itog = new JLabel("Ценa co скидкой:");
        itog_user=new JTextField("",1);

        JButton calculate = new JButton("Рассчитать цену co скидкou");


        buttonsandtext.add(name);
        buttonsandtext.add(name_user);
        buttonsandtext.add(CostWihtoutDiscont);
        buttonsandtext.add(CostWihtoutDiscont_user);
        buttonsandtext.add(Discont);
        buttonsandtext.add(Discont_user);
        buttonsandtext.add(itog);
        buttonsandtext.add(itog_user);
        buttonsandtext.add(calculate);

        calculate.addActionListener(new pick());

    }

    class pick implements ActionListener {
        static byte count=1;
        @Override
        public void actionPerformed(ActionEvent e) {
         if (CostWihtoutDiscont_user.getText().equals("")||name_user.getText().equals("")||Discont_user.getText().equals(""))
         {JOptionPane.showMessageDialog(null, "Для того чтобы программа работала необходимо ввести все данные кроме конечной цены, брат", "Привет, друг!", JOptionPane.PLAIN_MESSAGE);
         }
         else {
                 String bufer;
                 String nname = name_user.getText();
                                                                                        // объявление
                double ccostwihtoutdiscont = Double.valueOf(CostWihtoutDiscont_user.getText());
                 double ddiscont = Double.valueOf(Discont_user.getText());
                 double iitog;


             if (count > 5) {
                 JOptionPane.showMessageDialog(null, " НАХУЙ ТЫ СТОЛЬКО РАЗ НАЖИМАЕШЬ НА КНОПКУ ВСЕ БЛЯТЬ АТРАКЦИОН НЕВИДАННОЙ ЩЕДРОСТИ ЗАКОНЧИЛСЯ ЕБАНАТ ВЫКЛЮЧАЙ ПРОГРАММУ ПЕДРИЛА", "Привет, " + nname + "!", JOptionPane.PLAIN_MESSAGE);
             }//ну а че они так часто нажимают
             else{
             count++;


             iitog = ccostwihtoutdiscont * (1 - ddiscont/100);
             bufer = String.valueOf(iitog);//vivod
             itog_user.setText(bufer);}
         }

        }
    }


}
