package dojo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GalgenmaennchenTest{

    @Test
    fun `test with wrong character`() {
        assertThat(Galgenmaennchen("programm").rateBuchstabe('x')).isEqualTo("--------")
    }

    @Test
    fun `test with containing character`() {
        assertThat(Galgenmaennchen("programm").rateBuchstabe('r')).isEqualTo("-r--r---")
    }

    @Test
    fun `test with second containing character`() {
        assertThat(Galgenmaennchen("programm")
            .rateBuchstabe('r')
            .rateBuchstabe('o'))
            .isEqualTo("-ro-r---")
    }

}


