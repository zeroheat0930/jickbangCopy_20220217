package com.zeroheat.jickbangcopy_20220217

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeroheat.jickbangcopy_20220217.adapters.RoomAdapter
import com.zeroheat.jickbangcopy_20220217.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val mRoomList = ArrayList<RoomData>()


    //::으로 자료형 명시
    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mRoomList.add(RoomData(8000,"서울시 동대문구", 7, "1번째방"))
        mRoomList.add(RoomData(7000, "강원시 서대문구", 2, "2번째방"))
        mRoomList.add(RoomData(25600, "인천시 서대문구", 3, "3번째방"))
        mRoomList.add(RoomData(4000, "경기도 서대문구", -2, "4번째방"))
        mRoomList.add(RoomData(7000, "몰라 서대문구", -1, "5번째방"))
        mRoomList.add(RoomData(12000, "히힛 서대문구", 0, "6번째방"))
        mRoomList.add(RoomData(64400, "아저시 서대문구", 10, "7번째방"))
        mRoomList.add(RoomData(3000, "아가시 서대문구", 6, "8번째방"))
        mRoomList.add(RoomData(8000, "서시 서대문구", 5, "9번째방"))
        mRoomList.add(RoomData(29000, "수시 서대문구", 11, "10번째방"))
        mRoomList.add(RoomData(99900, "상시 서대문구", 24, "11번째방"))


//mcontext는 어떤화면인가? ,resId는 res폴더중에 어느걸꺼내다 쓸껀지 , 어레이 리스트는 엠 룸 리스트
        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        jicbangListView.adapter = mRoomAdapter

        jicbangListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)


        }
    }
}