package com.zeroheat.jickbangcopy_20220217

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeroheat.jickbangcopy_20220217.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kotlinx.android.synthetic.main.room_list_item.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

       val roomData = intent.getSerializableExtra("roominfo") as RoomData

    txtPrice2.text = roomData.getPrice()
        txtDescription.text = roomData.description
        txtAddress2.text = roomData.address
        txtFloor.text = roomData.getFloor()
    }
}