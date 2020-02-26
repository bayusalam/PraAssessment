package org.d3ifcool4046.praassessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3ifcool4046.praassessment.databinding.FragmentMenuBinding
import org.d3ifcool4046.praassessment.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_persegi_panjang, container, false)
//        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)
        binding.btnHitung.setOnClickListener {
            val panjang:Int=binding.panjangPP.text.toString().toInt()
            val lebar:Int=binding.LebarPP.text.toString().toInt()
            var luas:Int=(panjang*lebar)
            var keliling:Int=2*(panjang*lebar)
            tv_LuasPP.text=luas.toString()
            tv_kelilingPP.text=keliling.toString()
        }
        return binding.root
    }



}
