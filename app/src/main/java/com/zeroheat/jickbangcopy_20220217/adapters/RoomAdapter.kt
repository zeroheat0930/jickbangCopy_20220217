package com.zeroheat.jickbangcopy_20220217.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.zeroheat.jickbangcopy_20220217.R
import com.zeroheat.jickbangcopy_20220217.datas.RoomData

// class RoomAdapter : ArrayAdapter 자동완성기능 ㄱ
// 자식인 RoomAdapter가 ()에서 자료를 받아서 부모인 arrayadapter한테 넣어줘야됨
//그래서 맴버변수 mcontext, resid, mlist를 생성해줌
class RoomAdapter(val mContext: Context, val resId: Int, val mList: ArrayList<RoomData>) :
    ArrayAdapter<RoomData>(mContext , resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]


        return row
    }
}