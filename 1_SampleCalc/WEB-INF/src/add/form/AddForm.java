package add.form;

import org.apache.struts.action.ActionForm;

/**
 *
 * 計算用ActionForm
 *
 * @author peku
 *
 */
public class AddForm extends ActionForm {

	// 入力数値１
    private String num1;

    // 入力数値２
    private String num2;

    // 計算結果
    private String result;

    /**
     * 入力数値１ Getter
     *
     * @return 入力数値１
     */
	public String getNum1() {
		return num1;
	}

	/**
	 * 入力数値１ Setter
	 *
	 * @param num1 入力数値１
	 */
	public void setNum1(String num1) {
		this.num1 = num1;
	}

	/**
	 * 入力数値２ Getter
	 *
	 * @return 入力数値２
	 */
	public String getNum2() {
		return num2;
	}

	/**
	 * 入力数値２ Setter
	 *
	 * @param num2 入力数値２
	 */
	public void setNum2(String num2) {
		this.num2 = num2;
	}

	/**
	 * 計算結果 Getter
	 *
	 * @return 計算結果
	 */
	public String getResult() {
		return result;
	}

	/**
	 * 計算結果 Setter
	 *
	 * @param result 計算結果
	 */
	public void setResult(String result) {
		this.result = result;
	}
}
