package com.evdesporapp.model

import com.evdesporapp.R

object NotificationList {
    fun getNotificationItemList(): List<NotificationVM> {
        val itemModel1 = NotificationVM(
            R.drawable.ic_water,
            "Su içme zamanı!",
            "9 dk önce"
        )
        val itemModel2 = NotificationVM(
            R.drawable.ic_exercise,
            "Bugünkü egzersizini kaçırma!",
            "3 saat önce"
        )
        val itemModel3 = NotificationVM(
            R.drawable.ic_exercise,
            "Egzersiz Zamanı!",
            "10 saat önce"
        )
        val itemModel4 = NotificationVM(
            R.drawable.ic_water,
            "Su içmeyi unutma!",
            "35 dk önce"
        )
        val itemList: ArrayList<NotificationVM> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        return itemList
    }

}