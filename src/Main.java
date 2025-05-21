import java.awt.AWTException;

import java.awt.Color;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.io.IOException;
public class Main {
    public static void main(String[] args) throws AWTException, IOException {
        Robot robot1 = new Robot();
        //�ӳ�5�뿪ʼ���нű�
        robot1.delay(5000);

        //��ѭ��
        while (true) {
            //540�ǵ�һ�����м�ĺ����꣬ÿ��124���ڶ����������������ĸ���
            for (int i = 540; i < 1015; i += 124) {
                Color color = robot1.getPixelColor(i, 574);//485�������걣�ֲ���
                System.out.println("==="+color);//��ӡ��ɫ���˲������ʡ��

                //����ɫ��RֵΪ51ʱ�������ж�
                if (color.getRed() == 51) {

                    //������Ϊ460������D��
                    if (i == 540) {

                        robot1.keyPress(KeyEvent.VK_D);

                        robot1.keyRelease(KeyEvent.VK_D);
                        //������Ϊ560������F
                    } else if (i == 664) {

                        robot1.keyPress(KeyEvent.VK_F);

                        robot1.keyRelease(KeyEvent.VK_F);

                        //������Ϊ660������J
                    } else if (i == 788) {

                        robot1.keyPress(KeyEvent.VK_J);

                        robot1.keyRelease(KeyEvent.VK_J);

                        //������Ϊ760������K

                    } else if (i == 912) {
                        robot1.keyPress(KeyEvent.VK_K);
                        robot1.keyRelease(KeyEvent.VK_K);
                    }

                }

                robot1.delay(1);//�ӳ�1ms����ʼ��һ��ѭ������ʡ�ԣ�

            }

        }
    }
}