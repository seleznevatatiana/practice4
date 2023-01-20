package omikuji;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBManager;
import form.ListForm;

public class ResultDAO {

    //SQL文を準備
    public static String SQL_SELECT_FROM_RESULT = "SELECT omikuji_id FROM result WHERE birthday = ? AND uranai_date =?";
    public static String SQL_SELECT_FROM_RESULT_FOR_LIST = "SELECT r.uranai_date, u.unsei_name, o.negaigoto, o.akinai, o.gakumon FROM result r INNER JOIN omikuji o ON r.omikuji_id = o.omikuji_id INNER JOIN unseimaster u ON o.unsei_id = u.unsei_id WHERE r.birthday = ?";
    public static String SQL_INSERT_RESULT = "INSERT INTO result VALUES (?, ?, ?, ?, current_timestamp, ?, current_timestamp)";
    /**
     * 結果テーブルからデータ取得
     * @return omikujiId
     */
    public static String selectFromResult(String birthday, String uranaiDate) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String omikujiId = null;

        try {

            //Resultテーブルから誕生日と占い日が一致する場合
            // DBに接続
            connection = DBManager.getConnection();
            // ステートメントを作成
            preparedStatement = connection.prepareStatement(SQL_SELECT_FROM_RESULT);
            //入力値をバインド
            preparedStatement.setString(1, birthday);
            preparedStatement.setString(2, uranaiDate);
            // SQL文を実行
            ResultSet rs = null;
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                omikujiId = rs.getString("omikuji_id");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                // ResultSetをクローズ
                DBManager.close(resultSet);
                // Statementをクローズ
                DBManager.close(preparedStatement);
                // DBとの接続を切断
                DBManager.close(connection);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return omikujiId;
    }
    /**
     * 結果テーブルからデータ取得
     * @return birthday
     */
    public static ListForm selectFromResultForList(String birthday) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String omikujiId = null;
        ListForm listForm = null;

        try {

            //Resultテーブルから誕生日と占い日が一致する場合
            // DBに接続
            connection = DBManager.getConnection();
            // ステートメントを作成
            preparedStatement = connection.prepareStatement(SQL_SELECT_FROM_RESULT_FOR_LIST);
            //入力値をバインド
            preparedStatement.setString(1, birthday);
            // SQL文を実行
            ResultSet rs = null;
            rs = preparedStatement.executeQuery();

          //resultsetから値の取り出し方
            while (resultSet.next()) {
                omikujiId = rs.getString("omikuji_id");
                listForm.setUranaiDate(resultSet.getString("uranai_date"));
                listForm.setUnsei(resultSet.getString("unsei"));
                listForm.setNegaigoto(resultSet.getString("negaigoto"));
                listForm.setAkinai(resultSet.getString("akinai"));
                listForm.setGakumon(resultSet.getString("gakumon"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                // ResultSetをクローズ
                DBManager.close(resultSet);
                // Statementをクローズ
                DBManager.close(preparedStatement);
                // DBとの接続を切断
                DBManager.close(connection);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listForm;
    }

    /**
     * 結果テーブルにデータを登録
     * @return omikujiId
     */
    public static String insertResult(String birthday, String uranaiDate, String omikujiId) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            // DBに接続
            connection = DBManager.getConnection();
            // ステートメントを作成
            preparedStatement = connection.prepareStatement(SQL_INSERT_RESULT);
            //入力値をバインド
            //getを使う
            preparedStatement.setString(1, uranaiDate);
            preparedStatement.setString(2, birthday);
            preparedStatement.setString(3, omikujiId);
            preparedStatement.setString(4, "タチアナ");
            preparedStatement.setString(5, "タチアナ");

            // SQL文を実行
            int cnt4 = preparedStatement.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                // ResultSetをクローズ
                DBManager.close(resultSet);
                // Statementをクローズ
                DBManager.close(preparedStatement);
                // DBとの接続を切断
                DBManager.close(connection);
            }
            catch (Exception e) {
            }
        }
        return omikujiId;
    }
}
