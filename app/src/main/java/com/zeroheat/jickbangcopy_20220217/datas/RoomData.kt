package com.zeroheat.jickbangcopy_20220217.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomData (
    val price : Int,
    val address : String,
    val floor: Int,
    val description: String,
    ) : Serializable{
        fun getFloor() : String{
            if(this.floor >0){
                return "${this.floor}층"
            }
            else if (this.floor == 0){
                return "반지하"
            }
            else {
                return "지하${-this.floor}층"
            }
        }

      fun getPrice() : String {
          if (this.price < 10000) {
              return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
          } else {

              // 26500 => 2억 6500
              // 26000 / 10000 = 2 2추출 , 26500 % 10000 = 6500 나머지 6500추출
              val uk = this.price / 10000
              val rest = this.price % 10000

              return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)}"
          }
      }
}