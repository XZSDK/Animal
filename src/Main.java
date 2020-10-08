import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/*
将动物信息（种类，性别，年龄）保存在集合中（可以先保存一部分，再添加新的；也可以后面录入。在这里要不同的动物可能会有不同的属性）
在控制台输入指令，系统可以对动物信息进行基本的增加、删除、修改、查询、对年龄进行排序然后输出
像C语言题库里面的那种菜单式的系统，如输入1进行...操作，输入2进行...操作
考察内容：面向对象，泛型，异常，集合
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal>array = new ArrayList<Animal>();
        while(true) {
            System.out.println("程序开始");
            System.out.println("1.添加动物");
            System.out.println("2.删除动物");
            System.out.println("3.修改动物信息");
            System.out.println("4.查询动物");
            System.out.println("5.以年龄顺序输出动物信息");
            System.out.println("6.退出");
            Scanner sc = new Scanner(System.in);
            String opt = sc.nextLine();
            switch (opt) {
                case "1":
                    addAnimal(array);
                    //System.out.println("添加动物");
                    break;
                case "2":
                    deleteAnimal(array);
                    break;
                case "3":
                    updateAnimal(array);
                    //System.out.println("修改动物信息");
                    break;
                case "4":
                    findAniaml(array);
                    //System.out.println("查询动物");
                    break;
                case "5":
                    showAnimal(array);
                    break;
                case "6":
                    //System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("输出错误");
            }
        }
    }
    public static void addAnimal(ArrayList<Animal> array) {
        Animal a = new Animal();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入动物编号");
        String num=sc.nextLine();
        System.out.println("输入动物类型");
        String type = sc.nextLine();
        System.out.println("输入动物性别");
        String sex = sc.nextLine();
        System.out.println("输入动物年龄");
        String age = sc.nextLine();
        System.out.println("输入尾巴的数量");
        String tail=sc.nextLine();
        System.out.println("输入腿的数量");
        String leg=sc.nextLine();
        System.out.println("输入翼的数量");
        String wing=sc.nextLine();
        System.out.println("输入鳍的数量");
        String fin=sc.nextLine();
        a.setNum(num);
        a.setType(type);
        a.setSex(sex);
        a.setAge(age);
        a.setTail(tail);
        a.setLeg(leg);
        a.setWing(wing);
        a.setFin(fin);
        array.add(a);
}
    public static void showAnimal(ArrayList<Animal> array){
        for(int i=0;i< array.size()-1;i++)
        {
            Animal a1 = array.get(i);
            Animal a2 = array.get(i+1);
            int age1=Integer.valueOf(a1.getNum());
            int age2=Integer.valueOf(a2.getNum());
            if(age1<age2)
            {
                Collections.swap(array,i,i+1);
            }
        }
        System.out.println("编号  种类  性别  年龄  尾巴  腿  翼  鳍");
        for(int i=0;i<array.size();i++)
        {
            Animal a = array.get(i);
            System.out.println(a.getNum()+"  "+a.getType()+"  "+a.getSex()+"  "+a.getAge()+"  "+a.getTail()+"  "+a.getLeg()+"  "+a.getWing()+"  "+a.getFin());
        }
    }
    public static void deleteAnimal(ArrayList<Animal> array){
        System.out.println("输入删除动物的编号");
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        for(int i=0;i< array.size();i++){
            Animal a=array.get(i);
            if(a.getNum().equals(num))
            {
                array.remove(i);
                break;
            }
        }
        System.out.println("删除成功");
    }
    public static void updateAnimal(ArrayList<Animal> array) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要修改的动物的编号");
        String num=sc.nextLine();

        System.out.println("新输入动物类型");
        String type = sc.nextLine();
        System.out.println("新输入动物性别");
        String sex = sc.nextLine();
        System.out.println("新输入动物年龄");
        String age = sc.nextLine();
        System.out.println("新输入尾巴的数量");
        String tail=sc.nextLine();
        System.out.println("新输入腿的数量");
        String leg=sc.nextLine();
        System.out.println("新输入翼的数量");
        String wing=sc.nextLine();
        System.out.println("新输入鳍的数量");
        String fin=sc.nextLine();
        Animal a=new Animal();
        a.setNum(num);
        a.setType(type);
        a.setSex(sex);
        a.setAge(age);
        a.setTail(tail);
        a.setLeg(leg);
        a.setWing(wing);
        a.setFin(fin);
        for(int i=0;i<array.size();i++){
            Animal animal=array.get(i);
            if(animal.getNum().equals(num))
            {
                array.set(i,a);
                break;
            }
    }
    }
    public static void findAniaml(ArrayList<Animal> array) {
        System.out.println("根据编号查找请按1");
        System.out.println("根据种类查找请按2");
        Scanner sc = new Scanner(System.in);
        String opt = sc.nextLine();
        switch (opt) {
            case "1":
                System.out.println("请输入编号");
                String num = sc.nextLine();
                for (int i = 0; i < array.size(); i++) {
                    Animal a = array.get(i);
                    if (a.getNum().equals(num)) {
                        System.out.println("编号  种类  性别  年龄  尾巴  腿  翼  鳍");
                        System.out.println(a.getNum() + "  " + a.getType() + "  " + a.getSex() + "  " + a.getAge() + "  " + a.getTail() + "  " + a.getLeg() + "  " + a.getWing() + "  " + a.getFin());
                    }
                }
            case"2":
                System.out.println("请输入类型");
                String type=sc.nextLine();
                for (int i = 0; i < array.size(); i++) {
                    Animal a = array.get(i);
                    if (a.getType().equals(type)) {
                        System.out.println("编号  种类  性别  年龄  尾巴  腿  翼  鳍");
                        System.out.println(a.getNum() + "  " + a.getType() + "  " + a.getSex() + "  " + a.getAge() + "  " + a.getTail() + "  " + a.getLeg() + "  " + a.getWing() + "  " + a.getFin());
                    }
                }
        }
        System.out.println("查询完成");
    }
}
