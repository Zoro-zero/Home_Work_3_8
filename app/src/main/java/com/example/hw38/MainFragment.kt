package com.example.hw38

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw38.databinding.ActivityMainBinding
import com.example.hw38.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val carList = arrayListOf<Car>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = CarsAdapter(carList,this::onClick)
        binding.recycler.adapter = adapter
    }

    private fun loadData() {
        carList.add(Car("Mercedes - Benz","https://purepng.com/public/uploads/large/51506279779c6rntanvyoznezpyppnhohayyxtzb1fw4pyobj8vrqyxl5jgyo0x8wqtg9rcqmi0ddeo5f0xplr20eua2fmf3maooz8epuincm94.png",
                "Годы выпуска\n" +
                "1965 – н.в.\n" +
                "8 поколений\n" +
                "С пробегом\n" +
                "11 450 000 – 34 999 999 ₽"))
        carList.add(Car("Porsche","https://file.kelleybluebookimages.com/kbb/base/evox/CP/9794/2015-Porsche-911-front_9794_032_1809x730_A1_cropped.png",
                "Год выпуска:"+
                "2012"+
                "\nПробег:"+
                "53 000 км"))
        carList.add(Car("BMW","https://pngimg.com/uploads/bmw/bmw_PNG1684.png","BMW 5 серии 523i VI (F10/F11/F07)" +
                "Год выпуска\n" +
                "2012\n" +
                "Пробег\n" +
                "136 000 км\n" +
                "Кузов\n" +
                "Седан\n" +
                "Цвет\n" +
                "Серый\n" +
                "Двигатель\n" +
                "2.5 л / 204 л.с. / Бензин"))
        carList.add(Car("Daewoo","https://pngimg.com/uploads/daewoo/daewoo_PNG43.png",
                "Годы выпуска\n" +
                        "2007 – 2008\n" +
                        "1 поколение"))
        carList.add(Car("Lexus","https://www.pngmart.com/files/5/Lexus-Concept-PNG-Pic.png","Lexus LX 570 III Рестайлинг 2\n"+
                "Год выпуска\n" +
                "2018\n" +
                "Пробег\n" +
                "97 000 км\n" +
                "Кузов\n" +
                "Внедорожник 5 дв.\n" +
                "Цвет\n" +
                "Серый\n" +
                "Двигатель\n" +
                "5.7 л / 367 л.с. / Бензин"))
        carList.add(Car("Toyota","https://i.pinimg.com/originals/5f/bd/a1/5fbda1e31b3a32b8319a89b5ca9dca7d.png","Toyota Land Cruiser Prado 150 Series Рестайлинг 1\n" +
                "Год выпуска\n" +
                "2014\n" +
                "Пробег\n" +
                "97 000 км\n" +
                "Кузов\n" +
                "Внедорожник 5 дв.\n" +
                "Цвет\n" +
                "Серый\n" +
                "Двигатель\n" +
                "3.0 л / 190 л.с. / Дизель"))
        carList.add(Car("Lada","https://www.pngmart.com/files/9/Lada-PNG-Free-Download.png","LADA (ВАЗ) 2121 (4x4) Urban I Рестайлинг (2020)\n" +
                "Год выпуска\n" +
                "2020\n" +
                "Пробег\n" +
                "26 000 км\n" +
                "Кузов\n" +
                "Внедорожник 3 дв.\n" +
                "Цвет\n" +
                "Зелёный\n" +
                "Двигатель\n" +
                "1.7 л / 83 л.с. / Бензин"))
        carList.add(Car("Chevrolet","https://purepng.com/public/uploads/large/purepng.com-yellow-chevrolet-camaro-1le-carcarvehicletransportchevroletchevy-96152466732289fqa.png","Chevrolet Cruze I \n" +
                "Год выпуска\n" +
                "2011\n" +
                "Пробег\n" +
                "125 000 км\n" +
                "Кузов\n" +
                "Седан\n" +
                "Цвет\n" +
                "Белый\n" +
                "Двигатель\n" +
                "1.8 л / 141 л.с. / Бензин"))
    }
    private fun onClick(position:Int){
        val bundle = Bundle()
        bundle.putSerializable("key",carList[position])
        findNavController().navigate(R.id.secondFragment,bundle)
    }

}