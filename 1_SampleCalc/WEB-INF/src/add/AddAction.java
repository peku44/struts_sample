package add;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import add.form.AddForm;

/**
 *
 * 計算処理用Action
 *
 * @author peku
 *
 */
public class AddAction extends Action {

    Log log = LogFactory.getLog(AddAction.class);

    /**
     *
     * Action 処理
     *
     * @param mapping 遷移先マッピング情報
     * @param form 使用するActionForm
     * @param request HTTPリクエスト
     * @param response HTTPレスポンス
     */
    public ActionForward execute(ActionMapping mapping,
                                    ActionForm form,
                                    HttpServletRequest request,
                                    HttpServletResponse response)
    throws Exception {

    	// リクエスト値をUTF-8でエンコード
        request.setCharacterEncoding("UTF-8");

        // 取得したActionFormをAddFormにキャスト（型変換）
        AddForm addForm = (AddForm) form;

        // 入力値確認用ログ出力
        log.info(" num1 = " + addForm.getNum1());
        log.info(" num2 = " + addForm.getNum2());

        // 計算処理、結果をresultに設定
        addForm.setResult(String.valueOf(Integer.parseInt(addForm.getNum1()) + Integer.parseInt(addForm.getNum2())));

        // 遷移先のマッピングキーをsuccessに設定
        return mapping.findForward("success");
    }
}