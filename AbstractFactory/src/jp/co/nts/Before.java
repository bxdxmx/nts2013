package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Abstract factory�p�^�[��
 * �݂��Ɋ֘A������ �ˑ��������I�u�W�F�N�g�Q���A���̋�ۃN���X�𖾊m�ɂ����ɐ������邽�߂̃C���^�t�F�[�X��񋟂���B
 */

public class Before {
	public static void main(String[] args) {
		int a = 1;

		ICar car = null;
		ITrain train = null;
		
		if( a == 1 ) {
			car = new Car1();
			train = new Train1();
		} else if( a == 2 ) {
			car = new Car2();
			train = new Train2();
		}
		
		car.drive();
		train.move();
		
		/*
		 * program���ŋ�ۃN���X���ӎ����Ȃ��Ƃ����Ȃ��B�B
		 * program���ŃC���X�^���X��������Ƃ��ɁA�ԈႦ�Đݒ肷��\��������B
		 * a==3�̎������K�v�ɂȂ������ɁAif�̕���𑝂₳�Ȃ��Ƃ����Ȃ��B
		 */
	}
}
