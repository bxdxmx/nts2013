package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Singleton�p�^�[��
 *  ����N���X�ɑ΂��ăC���X�^���X���P�������݂��Ȃ����Ƃ�ۏ؂��A
 *  ����ɃA�N�Z�X���邽�߂̃O���[�o���ȕ��@��񋟂���B
 */

public class Before {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Car car = new Car();
			System.out.println(car.incrementNum());
		}
	}
}
