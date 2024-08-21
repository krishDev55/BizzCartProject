package xom.shop.persist;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reviews {
	@Id
	int review_id;

	String review_text;
	int rating;
	int sentiment_score;
	/*
	 * sentiment_score-numeric-Sentiment score calculated by- sentiment_analysis
	 * module reviews
	 */

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public String getReview_text() {
		return review_text;
	}

	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getSentiment_score() {
		return sentiment_score;
	}

	public void setSentiment_score(int sentiment_score) {
		this.sentiment_score = sentiment_score;
	}

	@Override
	public String toString() {
		return "Reviews [review_id=" + review_id + ", review_text=" + review_text + ", rating=" + rating
				+ ", sentiment_score=" + sentiment_score + "]";
	}

	public Reviews() {
		System.out.println("This is Reviews controller");
	}

}
