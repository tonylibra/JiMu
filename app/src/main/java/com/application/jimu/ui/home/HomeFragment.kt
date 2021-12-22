package com.application.jimu.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import com.application.jimu.R
import com.application.jimu.core.component.JiMuTree
import com.application.jimu.databinding.FragmentComposeBinding
import com.application.jimu.ui.theme.JimuTheme

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    lateinit var binding: FragmentComposeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentComposeBinding.inflate(inflater, container, false)
        return binding.composeView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                JimuTheme {
                    JiMuTree.content(
                        context = context,
                        response = context
                            .resources.openRawResource(R.raw.test1).bufferedReader()
                            .use { it.readText() },
                    )
                }
            }
        }
    }
}