package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Factory Methodパターン
 *  オブジェクトを生成するときのインタフェースだけを規定して、実際にどのクラスをインスタンス化するかはサブクラスが決めるようにする。
 *  Factory Methodパターンはインスタンス化をサブクラスに任せる。
 * 
 * Factory Methodパターンでは、Template Methodパターンを内容する。
 * 
 * Template Methodパターン
 *  １つのオペレーションにアルゴリズムのスケルトンを定義しておき、その中のいくつかのステップについては、
 *  サブクラスでの定義に任せることにする。Template Methodパターンでは、アルゴリズムの構造を変えずに、
 *  アルゴリズム中のあるステップをサブクラスで再定義する。
 * 
 */

public class Before {
	public static void main(String[] args) {
		// before省略
		
		/*
		 * 呼び出し側でサブクラスの実装を意識する必要がある。
		 * 重複したコードが発生する。
		 */
	}
}
