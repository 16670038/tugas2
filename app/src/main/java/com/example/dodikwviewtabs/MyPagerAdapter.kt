package com.example.dodikwviewtabs

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){
    private val pages = listOf(
        F1(),
        F2(),
        F3(),
        F4()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Profil"
            1 -> "Beranda"
            2 -> "Info"
            else -> "Tentang"
        }
    }
}