package com.matin.eftguide.fragment.quest_related

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.matin.eftguide.R
import kotlinx.android.synthetic.main.fragment_quest_explain.view.*
import org.jetbrains.anko.support.v4.toast

class MenuQuestExplainFragment : Fragment() {
    private val quests: String? by lazy { requireArguments().getString("quest") }

    // 이름, 유형, 목표, 요구 조건, 보상, 실패 패널티, 연계 퀘스트, 팁, 카파퀘 필요 여부, 지도

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_quest_explain, container, false)

        try {
            val resId = resources.getIdentifier(quests, "array", context?.packageName)
            val quest = resources.getStringArray(resId)

            view.tv_quest_name.text = quest[0]
            view.tv_quest_kind.text = quest[1]
            view.tv_quest_object.text = quest[2]
            view.tv_quest_requirement.text = quest[3]
            view.tv_quest_reward.text = quest[4]
            view.tv_quest_penalty.text = quest[5]
            view.tv_quest_relate.text = quest[6]
            view.tv_quest_tip.text = quest[7]
            view.tv_quest_need_for_kappa.text = quest[8]

        }catch (e: Exception){
            toast("에러가 발생하였습니다. $e")
        }

        return view
    }
}