package com.xuechuan.xcedu.fragment.view;

import android.widget.EditText;

import com.xuechuan.xcedu.utils.GmReadColorManger;
import com.xuechuan.xcedu.vo.SqliteVo.DoBankSqliteVo;
import com.xuechuan.xcedu.vo.SqliteVo.ErrorSqliteVo;
import com.xuechuan.xcedu.vo.SqliteVo.QuestionSqliteVo;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: xcedu
 * @Package com.xuechuan.xcedu.fragment.view
 * @Description: 案例分析
 * @author: L-BackPacker
 * @date: 2019.01.05 下午 1:39
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2019
 */
public interface CaseInterface {
    /**
     * 保存用做题数据
     *
     * @param vo
     */
    public void saveUserDoLog(DoBankSqliteVo vo);

    /**
     * 获取用户做题记录
     *
     * @param quesiton_id
     * @return
     */
    public DoBankSqliteVo getUserDoLog(int quesiton_id);

    /**
     * 删除用户做题记录
     *
     * @param quesiton_id
     */
    public void deleteUserDolog(int quesiton_id);

    /**
     * 下一题
     */
    public void doRightGo();

    /**
     * 查询用户做数据
     *
     * @param qustion_id
     * @return
     */
    public DoBankSqliteVo queryUserData(int qustion_id);

    /**
     * 该变颜色
     *
     * @param colorManger
     */
    public void changerColor(GmReadColorManger colorManger);

    /**
     * 保存错题记录记录
     */
    public void doErrorLog(ErrorSqliteVo vo);

    //改变副题
    public void changerSmallQuestion(int postion);

    //切换主题
    public void changerMainQuesiton();

    /**
     * 初始化 bar
     *
     * @param isShow
     */
    public void doEventHine(boolean isShow);

    /**
     * 是否是主观题
     *
     * @return
     */
    public boolean getMainQuesiton();

    /**
     * 获取当前总数
     *
     * @return
     */
    public int getFuPostionList();

    /**
     * 根据id获取相应题信息
     *
     * @param id
     * @return
     */
    public QuestionSqliteVo getQuestionVo(int id);

    public void changerCllect();

    /**
     * 语音输入
     *
     * @param editText
     */
    public void videoInput(EditText editText);
}
