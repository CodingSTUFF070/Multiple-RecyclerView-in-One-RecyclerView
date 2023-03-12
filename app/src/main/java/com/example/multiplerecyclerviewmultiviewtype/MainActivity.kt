package com.example.multiplerecyclerviewmultiviewtype

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerviewmultiviewtype.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mList: ArrayList<DataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mainRecyclerView.setHasFixedSize(true)
        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)

        mList = ArrayList()
        prepareData()

        val adapter = MainAdapter(mList)
        binding.mainRecyclerView.adapter = adapter
    }

    private fun prepareData() {

        // best seller
        val bestSellerList = ArrayList<RecyclerItem>()
        bestSellerList.add(RecyclerItem(R.drawable.bags , "Up to 20% off"))
        bestSellerList.add(RecyclerItem(R.drawable.mobiles, "Up to 10% off"))
        bestSellerList.add(RecyclerItem(R.drawable.watches, "Up to 40% off"))
        bestSellerList.add(RecyclerItem(R.drawable.bags, "Up to 20% off"))
        bestSellerList.add(RecyclerItem(R.drawable.mobiles, "Up to 10% off"))
        bestSellerList.add(RecyclerItem(R.drawable.watches, "Up to 40% off"))

        //clothing
        val clothingList = ArrayList<RecyclerItem>()
        clothingList.add(RecyclerItem(R.drawable.levis_clothing, "Up to 25% off"))
        clothingList.add(RecyclerItem(R.drawable.women_clothing, "Up to 30% off"))
        clothingList.add(RecyclerItem(R.drawable.nikeshoes, "Up to 35% off"))
        clothingList.add(RecyclerItem(R.drawable.levis_clothing, "Up to 25% off"))
        clothingList.add(RecyclerItem(R.drawable.women_clothing, "Up to 30% off"))
        clothingList.add(RecyclerItem(R.drawable.nikeshoes, "Up to 35% off"))

        mList.add(DataItem(DataItemType.BEST_SELLER, bestSellerList))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.tv_offer)))
        mList.add(DataItem(DataItemType.CLOTHING, clothingList))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.nikon_canon_offer)))
        mList.add(DataItem(DataItemType.BEST_SELLER, bestSellerList.asReversed()))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.offer_shoping)))
    }
}