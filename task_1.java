@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
     assertEquals("Ошибка: пользователю больше 18 лет, но возвращается false", true, isAdult);
}
