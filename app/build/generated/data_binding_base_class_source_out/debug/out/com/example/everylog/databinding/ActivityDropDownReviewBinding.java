// Generated by view binder compiler. Do not edit!
package com.example.everylog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.everylog.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDropDownReviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout ChangeLayout;

  @NonNull
  public final ConstraintLayout ConstraintLayout;

  @NonNull
  public final ImageButton btnTrash;

  @NonNull
  public final Spinner spinner;

  private ActivityDropDownReviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull FrameLayout ChangeLayout, @NonNull ConstraintLayout ConstraintLayout,
      @NonNull ImageButton btnTrash, @NonNull Spinner spinner) {
    this.rootView = rootView;
    this.ChangeLayout = ChangeLayout;
    this.ConstraintLayout = ConstraintLayout;
    this.btnTrash = btnTrash;
    this.spinner = spinner;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDropDownReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDropDownReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_drop_down_review, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDropDownReviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ChangeLayout;
      FrameLayout ChangeLayout = ViewBindings.findChildViewById(rootView, id);
      if (ChangeLayout == null) {
        break missingId;
      }

      ConstraintLayout ConstraintLayout = (ConstraintLayout) rootView;

      id = R.id.btnTrash;
      ImageButton btnTrash = ViewBindings.findChildViewById(rootView, id);
      if (btnTrash == null) {
        break missingId;
      }

      id = R.id.spinner;
      Spinner spinner = ViewBindings.findChildViewById(rootView, id);
      if (spinner == null) {
        break missingId;
      }

      return new ActivityDropDownReviewBinding((ConstraintLayout) rootView, ChangeLayout,
          ConstraintLayout, btnTrash, spinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
