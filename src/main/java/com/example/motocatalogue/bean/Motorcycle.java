package com.example.motocatalogue.bean;

import java.time.LocalDateTime;

import lombok.Data;

@Data  // Lombokの機能で、コンパイル時に自動的にアクセスメソッド(set, get)を作ってくれて、ボイラープレートコードを省略できるようになる。
public class Motorcycle {
  // バイクNo.
  private String motoNo;

  //バイク名
  private String motoName;

  // シート高
  private Integer seatHeight;

  // シリンダー
  private Integer cylinder;

  // 冷却
  private Integer cooling;

  // 価格
  private Integer price;

  // コメント
  private Integer comment;

  // ブランド(ブランドID)
  // private String brandId;
  private Brand brand; // Brandクラスのインスタンスを持つように変更。

  // バージョン
  private Integer version;

  // 登録日時
  private LocalDateTime insertDate;

  // 更新日時
  private LocalDateTime updateDate;
}


// もしLombokを使わなかった場合、(motoNoを例に)こう記述しないといけない。
// public void setMotoNo(String motoNo) {  //motoNoというフィールドに値をセットするメソッド
//   this.motoNo = motoNo;
// }
// public String getMotoNo() {  // motoNoというフィールドから値を取り出すメソッド
//   return this.motoNo;
// }
