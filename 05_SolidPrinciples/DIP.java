class RecentlyAddedBadExample {
  public void getRecommendations() {
    System.out.println("Getting recommendations for recently added items...");
  }
}

class RecommendationEngineBadExample {
  public RecentlyAddedBadExample recentlyAdded = new RecentlyAddedBadExample();

  public void recommend() {
    recentlyAdded.getRecommendations();
  }
}

// Issues in the above code:
// RecommendationEngine is tightly coupled to RecentlyAdded.
// If we want to switch to TrendingNow or GenreBased strategies, we have to modify the engine.

// GOOD EXAMPLE
interface RecommendationStrategy {
  void getRecommendations();
}

class RecentlyAddedGoodExample implements RecommendationStrategy {
  public void getRecommendations() {
    System.out.println("Getting recommendations for recently added items...");
  }
}

class TrendingNowGoodExample implements RecommendationStrategy {
  public void getRecommendations() {
    System.out.println("Getting recommendations for trending items...");
  }
}

class GenreBasedGoodExample implements RecommendationStrategy {
  public void getRecommendations() {
    System.out.println("Getting recommendations based on genre...");
  }
}

class RecommendationEngineGoodExample {
  private RecommendationStrategy strategy;

  public RecommendationEngineGoodExample(RecommendationStrategy strategy) {
    this.strategy = strategy;
  }

  public void recommend() {
    strategy.getRecommendations();
  }
}

public class DIP {
  public static void main(String[] args) {
    RecommendationEngineGoodExample engine = new RecommendationEngineGoodExample(new RecentlyAddedGoodExample());
    engine.recommend();

    engine = new RecommendationEngineGoodExample(new TrendingNowGoodExample());
    engine.recommend();

    engine = new RecommendationEngineGoodExample(new GenreBasedGoodExample());
    engine.recommend();
  }
}
