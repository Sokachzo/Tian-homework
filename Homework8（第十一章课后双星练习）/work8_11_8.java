import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

class Account{
    private int id = 0;   //�˻���
    private double balance = 0;   //���
    static private double annualInterestRate = 0;      //������
    private java.util.Date dateCreate = new java.util.Date();  //��������
    Account(){  //����Ĭ���˻�
        dateCreate = new Date();
    }

    Account(int ID,double Balances){  //����ָ���û��ͳ�ʼ���
        id = ID;
        balance = Balances;
        dateCreate = new Date();
    }

    public int getID(){  //���� ID
        return id;
    }

    public void setID(int name){  //�޸� ID
        id = name;
    }

    public double getBalance(){  //���� ���
        return balance;
    }

    public void setBalance(double newbalance){  //�޸� ���
        balance =  newbalance;
    }

    public double getAnnualInterestRate(){   //���� ������
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newrate){   //�޸� ������
        annualInterestRate = newrate;
    }

    public java.util.Date getDateCreate(){  //���� ��������
        return dateCreate;
    }

    public double getMonthlyInterestRate(){  //����������;
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){  //��������Ϣ
        return balance * getMonthlyInterestRate();
    }

    public void withDraw(double drawMoney){  //ȡ��
        if (balance >= drawMoney)
            balance = balance - drawMoney;
    }

    public void deposit(double saveMoney){  //���
        balance = balance + saveMoney;
    }
}

public class work8_11_8 extends Account{
    private String name; //�ͻ���
    private ArrayList<Transaction> transactions;  //�洢������ϸ
    public work8_11_8(String Name,int ID,double Balances){  //��������ָ�����֣�id�������˻�
        name = Name;
        setID(ID);
        setBalance(Balances);
        this.transactions = new ArrayList<Transaction>();
    }
    public void Draw(double Money){   //ȡ��
        withDraw(Money);
        transactions.add( new Transaction('W',Money,getBalance(),"���׳ɹ�"));
    }
    public void Deposit(double Money){  //���
        deposit(Money);
        transactions.add( new Transaction('D',Money,getBalance(),"���׳ɹ�"));
    }
    public String getName(){  //���� �ͻ���
        return name;
    }
    public void setName(String Name){  //�޸� �ͻ���
        name = Name;
    }
    public static void main(String[] args) {
    	work8_11_8 account = new work8_11_8("George",1122,1000.0);
        account.setAnnualInterestRate(1.5/100);
        account.Deposit(30.0);
        account.Deposit(40.0);
        account.Deposit(50.0);
        account.Draw(5.0);
        account.Draw(4.0);
        account.Draw(2.0);
        System.out.println("�ͻ�����" + account.getName() + " �����ʣ�" + account.getAnnualInterestRate() + " ��ǰ��" + account.getBalance() + "��Ԫ");
        System.out.print(account.transactions.toString());
    }
}

class Transaction{
    private Date date;  //�ý��׵�����
    private char type;  //�������ͣ��硰W������ȡ���D��������
    private double amount;  //������
    private double balance; //���׺��µ����
    private String description;  //��������
    Transaction(char Type,double Amount,double Balance,String Description){
        type = Type;
        amount = Amount;
        balance = Balance;
        description = Description;
        date = new Date();
    }
    public Date getDate(){  //���� ��������
        return date;
    }
    public char getType(){  //���� ��������
        return type;
    }
    public double getAmount(){  //���� ������
        return amount;
    }
    public double getBalance(){  //���� ���׺����
        return balance;
    }
    @Override
    public String toString(){
        return "���׼�¼��" + new SimpleDateFormat("yyyy-MM-dd").format(date) + " " + type + " " + amount + " " + balance + " ��Ԫ " + description + "\n";
    }
}
