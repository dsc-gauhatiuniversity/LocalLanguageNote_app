package com.djd.youniversityNotebook.util

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.localbroadcastmanager.content.LocalBroadcastManager
/* import com.djd.youniversitynotebook.R */
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import djd.youniversityNotebook.R
import kotlinx.android.synthetic.main.fragment_notes_bottom_sheet.*

class NoteBottomSheetFragment : BottomSheetDialogFragment() {
    var selectedColor = "#171C26"


    companion object {
        var noteId = -1
        fun newInstance(id: Int): NoteBottomSheetFragment {
            val args = Bundle()
            val fragment = NoteBottomSheetFragment()
            fragment.arguments = args
            noteId = id
            return fragment
        }
    }

    override fun setupDialog(dialog: Dialog, style: Int) {

        super.setupDialog(dialog, style)

        val view = LayoutInflater.from(context).inflate(R.layout.fragment_notes_bottom_sheet, null)
        dialog.setContentView(view)

        val param = (view.parent as View).layoutParams as CoordinatorLayout.LayoutParams

        val behavior = param.behavior

        if (behavior is BottomSheetBehavior<*>) {
            behavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onSlide(bottomSheet: View, slideOffset: Float) {
                    TODO("Not yet implemented")
                }

                override fun onStateChanged(bottomSheet: View, newState: Int) {
                    var state = ""
                    when (newState) {
                        BottomSheetBehavior.STATE_DRAGGING -> {
                            state = "DRAGGING"
                        }
                        BottomSheetBehavior.STATE_SETTLING -> {
                            state = "SETTLING"
                        }
                        BottomSheetBehavior.STATE_EXPANDED -> {
                            state = "EXPANDED"
                        }
                        BottomSheetBehavior.STATE_COLLAPSED -> {
                            state = "COLLAPSED"
                        }

                        BottomSheetBehavior.STATE_HIDDEN -> {
                            state = "HIDDEN"
                            dismiss()
                            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
                        }

                    }
                }

            })


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notes_bottom_sheet, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (noteId != -1) {
            layoutDeleteNote.visibility = View.VISIBLE
        } else {
            layoutDeleteNote.visibility = View.GONE
        }
        setListener()
    }

    private fun setListener() {
        fNote1.setOnClickListener {

            imgNote1.setImageResource(R.drawable.tickimg)
            imgNote2.setImageResource(0)
            imgNote4.setImageResource(0)
            clr2.setImageResource(0)
            clr4.setImageResource(0)
            clr6.setImageResource(0)
            selectedColor = "#4e33ff"

            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "Blue")
            intent.putExtra("selectedColor", selectedColor)
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)

        }

        fNote2.setOnClickListener {
            imgNote1.setImageResource(0)
            imgNote2.setImageResource(R.drawable.tickimg)
            imgNote4.setImageResource(0)
            clr2.setImageResource(0)
            clr4.setImageResource(0)
            clr6.setImageResource(0)
            selectedColor = "#ffd633"

            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "Yellow")
            intent.putExtra("selectedColor", selectedColor)
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)

        }

        fNote4.setOnClickListener {
            imgNote1.setImageResource(0)
            imgNote2.setImageResource(0)
            imgNote4.setImageResource(R.drawable.tickimg)
            clr2.setImageResource(0)
            clr4.setImageResource(0)
            clr6.setImageResource(0)
            selectedColor = "#ae3b76"

            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "Purple")
            intent.putExtra("selectedColor", selectedColor)
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)

        }

        clr1.setOnClickListener {
            imgNote1.setImageResource(0)
            imgNote2.setImageResource(0)
            imgNote4.setImageResource(0)
            clr2.setImageResource(R.drawable.tickimg)
            clr4.setImageResource(0)
            clr6.setImageResource(0)
            selectedColor = "#0aebaf"

            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "Green")
            intent.putExtra("selectedColor", selectedColor)
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
        }

        clr3.setOnClickListener {

            imgNote1.setImageResource(0)
            imgNote2.setImageResource(0)
            imgNote4.setImageResource(0)
            clr2.setImageResource(0)
            clr4.setImageResource(R.drawable.tickimg)
            clr6.setImageResource(0)
            selectedColor = "#ff7746"
            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "Orange")
            intent.putExtra("selectedColor", selectedColor)
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
        }

        clr5.setOnClickListener {
            imgNote1.setImageResource(0)
            imgNote2.setImageResource(0)
            imgNote4.setImageResource(0)
            clr2.setImageResource(0)
            clr4.setImageResource(0)
            clr6.setImageResource(R.drawable.tickimg)
            selectedColor = "#202734"

            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "Black")
            intent.putExtra("selectedColor", selectedColor)
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
        }

        layoutImage.setOnClickListener {
            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "Image")
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
            dismiss()
        }
        layoutWebUrl.setOnClickListener {
            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "WebUrl")
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
            dismiss()
        }
        layoutDeleteNote.setOnClickListener {
            val intent = Intent("bottom_sheet_action")
            intent.putExtra("action", "DeleteNote")
            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
            dismiss()
        }


    }


}