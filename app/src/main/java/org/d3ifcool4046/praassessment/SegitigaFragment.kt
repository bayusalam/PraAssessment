package org.d3ifcool4046.praassessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.d3ifcool4046.praassessment.databinding.FragmentPersegiPanjangBinding
import org.d3ifcool4046.praassessment.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_segitiga, container, false)
//        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)
        binding.btnHitung.setOnClickListener {
            val alas=binding.alasSegitiga.text.toString().toDouble()
            val tinggi=binding.tinggiSegitiga.text.toString().toDouble()
            var luasS=alas*tinggi/2
            var ssMiring = Math.sqrt(alas*alas+tinggi*tinggi)
            var keliling= (alas+tinggi+ssMiring)
            tv_LuasSegitiga.text=luasS.toString()
            tv_kelilingSegitiga.text=keliling.toString()

        }
        return binding.root
    }



}
