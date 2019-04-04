package demo.rlv.cehome.com.navigationcomponents


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_two.*


/**
 * @author yangzc
 *
 */
class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        button_one.text = "${button_one.text}+${this}"
        view?.findViewById<Button>(R.id.button_one)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.action_twoFragment_to_fragment_three)
            }
        }
    }


}
