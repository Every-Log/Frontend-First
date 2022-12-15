// Generated by view binder compiler. Do not edit!
package com.example.everylog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.everylog.R;
import com.twoiq.hashtagify.CustomEditText;
import com.willy.ratingbar.ScaleRatingBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWriteSceneBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CustomEditText ReviewHashTagEditText;

  @NonNull
  public final ImageView ReviewImageView;

  @NonNull
  public final EditText editReviewInfo;

  @NonNull
  public final ScaleRatingBar editReviewRatingBar;

  @NonNull
  public final EditText editReviewTextTitle;

  @NonNull
  public final EditText editTextReviewContent;

  @NonNull
  public final LinearLayout hashtagLayout;

  @NonNull
  public final LinearLayout reviewWriteLayout;

  @NonNull
  public final Button reviewWritesubmitBtn;

  private ActivityWriteSceneBinding(@NonNull ConstraintLayout rootView,
      @NonNull CustomEditText ReviewHashTagEditText, @NonNull ImageView ReviewImageView,
      @NonNull EditText editReviewInfo, @NonNull ScaleRatingBar editReviewRatingBar,
      @NonNull EditText editReviewTextTitle, @NonNull EditText editTextReviewContent,
      @NonNull LinearLayout hashtagLayout, @NonNull LinearLayout reviewWriteLayout,
      @NonNull Button reviewWritesubmitBtn) {
    this.rootView = rootView;
    this.ReviewHashTagEditText = ReviewHashTagEditText;
    this.ReviewImageView = ReviewImageView;
    this.editReviewInfo = editReviewInfo;
    this.editReviewRatingBar = editReviewRatingBar;
    this.editReviewTextTitle = editReviewTextTitle;
    this.editTextReviewContent = editTextReviewContent;
    this.hashtagLayout = hashtagLayout;
    this.reviewWriteLayout = reviewWriteLayout;
    this.reviewWritesubmitBtn = reviewWritesubmitBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWriteSceneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWriteSceneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_write_scene, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWriteSceneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ReviewHashTagEditText;
      CustomEditText ReviewHashTagEditText = ViewBindings.findChildViewById(rootView, id);
      if (ReviewHashTagEditText == null) {
        break missingId;
      }

      id = R.id.ReviewImageView;
      ImageView ReviewImageView = ViewBindings.findChildViewById(rootView, id);
      if (ReviewImageView == null) {
        break missingId;
      }

      id = R.id.editReviewInfo;
      EditText editReviewInfo = ViewBindings.findChildViewById(rootView, id);
      if (editReviewInfo == null) {
        break missingId;
      }

      id = R.id.editReviewRatingBar;
      ScaleRatingBar editReviewRatingBar = ViewBindings.findChildViewById(rootView, id);
      if (editReviewRatingBar == null) {
        break missingId;
      }

      id = R.id.editReviewTextTitle;
      EditText editReviewTextTitle = ViewBindings.findChildViewById(rootView, id);
      if (editReviewTextTitle == null) {
        break missingId;
      }

      id = R.id.editTextReviewContent;
      EditText editTextReviewContent = ViewBindings.findChildViewById(rootView, id);
      if (editTextReviewContent == null) {
        break missingId;
      }

      id = R.id.hashtagLayout;
      LinearLayout hashtagLayout = ViewBindings.findChildViewById(rootView, id);
      if (hashtagLayout == null) {
        break missingId;
      }

      id = R.id.reviewWriteLayout;
      LinearLayout reviewWriteLayout = ViewBindings.findChildViewById(rootView, id);
      if (reviewWriteLayout == null) {
        break missingId;
      }

      id = R.id.reviewWritesubmitBtn;
      Button reviewWritesubmitBtn = ViewBindings.findChildViewById(rootView, id);
      if (reviewWritesubmitBtn == null) {
        break missingId;
      }

      return new ActivityWriteSceneBinding((ConstraintLayout) rootView, ReviewHashTagEditText,
          ReviewImageView, editReviewInfo, editReviewRatingBar, editReviewTextTitle,
          editTextReviewContent, hashtagLayout, reviewWriteLayout, reviewWritesubmitBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
