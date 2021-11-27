package com.ergi.ergiarr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Ergi Alifio Rifero", "Laki-laki", "ergi_20310022@stimata.ac.id",
            "085258022025", "Klayatan")
        )
        listTeman.add(
            MyFriend("Alief Affansyah", "Laki-laki", "alief_20310023@stimata.ac.id",
            "089654034070", "Pandan Landung")
        )
        listTeman.add(
            MyFriend("Bobby Penaloza", "Laki-laki", "bobby_20310019@stimata.ac.id",
            "08887085140", "Jodipan")
        )
        listTeman.add(
            MyFriend("Moch Rizal Hermawan", "Laki-laki", "moch_20310012@stimata.ac.id",
            "085895875364", "Blitar")
        )
        listTeman.add(
            MyFriend("Denisa Mei Linda Sari", "Perempuan", "denisa_20310018@stimata.ac.id",
            "085888043162", "Blitar")
        )
        listTeman.add(
            MyFriend("Livia Dita Eka Puspita", "Perempuan", "livia_20310017@stimata.ac.id",
            "088234039767", "Sawojajar")
        )
        listTeman.add(
            MyFriend("Nur Intan Maghfiroh", "Perempuan", "nur_20310021@stimata.ac.id",
            "08871294510", "Gampingan")
        )
        listTeman.add(
            MyFriend("Izza Syafia Almaliki", "Perempuan", "izza_20310006@stimata.ac.id",
            "081331093499", "Panjen")
        )
    }
    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}