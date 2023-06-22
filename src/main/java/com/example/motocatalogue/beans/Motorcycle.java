package com.example.motocatalogue.beans;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * バイク詳細
 */

@Data  // Lombokの機能で、コンパイル時に自動的にアクセスメソッド(set, get)を作ってくれて、ボイラープレートコードを省略できるようになる。
@AllArgsConstructor  // Lombokの機能。すべてのフィールドを引数に持つコンストラクタを自動生成してくれる。(今回だと、motoNo～updateDateまですべてを対象。)
@NoArgsConstructor  // Lombokの機能。引数のないデフォルトのコンストラクタを作成してくれる。
public class Motorcycle {
  // バイクNo.
  private Integer motoNo;

  //バイク名
  private String motoName;

  // シート高
  private Integer seatHeight;

  // シリンダー
  private Integer cylinder;

  // 冷却
  private String cooling;

  // 価格
  private Integer price;

  // コメント
  private String comment;

  // ブランド(ブランドID)
  // private String brandId;
  private Brand brand; // Brandクラスのインスタンスを持つように変更。

  // バージョン
  private Integer version;

  // 登録日時
  private LocalDateTime insertDate;

  // 更新日時
  private LocalDateTime updateDate;


  // Lombokを使わない場合、コンストラクタは以下のように普通に定義することになる。
  // Motocycle() {

  // }


}


// もしLombokを使わなかった場合、(motoNoを例に)こう記述しないといけない。
// public void setMotoNo(String motoNo) {  //motoNoというフィールドに値をセットするメソッド
//   this.motoNo = motoNo;
// }
// public String getMotoNo() {  // motoNoというフィールドから値を取り出すメソッド
//   return this.motoNo;
// }
