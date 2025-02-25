package com.matin.eftguide.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.matin.eftguide.MenuActivity
import com.matin.eftguide.R
import kotlinx.android.synthetic.main.fragment_mechanism.view.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MechanismFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mechanism, container, false)
        view.tv_m_penetrate.onClick{
            startActivity(Intent(context, MenuActivity::class.java).putExtra("where", "penetrate chance"))
        }
        return view
    }
}