@RunWith(Parameterized.class)
public class CheckIsAdultTest {
  
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
    this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getData() {
    return new Object[][] {
      {19, true}, // совершеннолетний (больше 18 лет)
      {17, false}, // несовершеннолетний (меньше 18 лет)
      {18, true}, // совершеннолетний (ровно 18 лет)
      {20, true}, // совершеннолетний (больше 18 лет)
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Проверка совершеннолетия пользователя", result, isAdult);
  }
}
