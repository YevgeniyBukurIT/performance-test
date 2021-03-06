package jekuni4

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Jeckuni4Simulation extends Simulation {

  private val httpProtocol = http
    .baseUrl("http://149.154.167.51")
    .inferHtmlResources(AllowList(), DenyList())
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("ru-RU,en,*")
    .contentTypeHeader("application/x-www-form-urlencoded")
    .userAgentHeader("Mozilla/5.0")
  
  
  private val uri1 = "http://149.154.167.50/api"

  private val scn = scenario("Jeckuni4Simulation")
    .exec(
      http("request_0")
        .post("/api")
        .formParam("        ��i>���al   x�F`��
      ۋ�]�����un�8'ސ*�i�J�i����مۇۻ�a�KI y�H���4�ˢ", "")
        .formParam("�H���U��v�M*����U���>���	mƅA'�֙h�s(u^���", "")
        .resources(
          http("request_1")
            .post(http://149.154.167.50:80/api)
            .formParam("""        lrd>���al   x�F`���
          �P�ö��u�2 \��;��.�
          [0:�C�}�J�ݘ,�}-,�{y1ͨ����n��؇�`��#�amCcd���t���O���7�,�53�v��<)l@��Uk""", ""),
          http("request_2")
            .post(http://149.154.167.50:80/api)
            .formParam("""#��hCW��ޒ�؋rQ�V,�qG�"�Ѵ>�y/��$p�@vT�ܣj�/L٣�G�OAT�'z�8l�B��@"`��^�w*Xk���0�>�'�N�����u�:9C""", "")
            .formParam("��]>�ޘ", "2:Z>yl��=����1�w�hԄ@Fv���S�(������'.G�x�}S�.��VX27� 񺀻�������")
            .formParam("""��N8o��t'd�}�0�FU�(�|$z�M�p�	�L)"�0 ��R�w��N�o�<��6���""", """m����4�Uvf����x;�� ��0l� ��	B�X�
          0��Jh�!~�Ux��q {w���wL8z<rc�̳�ψ`f��"""),
          http("request_3")
            .post(http://149.154.167.50:80/api)
            .formParam("""#��hCW���1��M�LG�f�E៧!�m���9z�
           t{{t]]Uc����l���G��!�(�`6#�w���o�
          S���e	����-�9�rX?��XV3���2U� ]�؅R�*a.IX[��l�����x�\���eP;Z���S��w.l��-�4
          """, ""),
          http("request_4")
            .post(http://149.154.167.50:80/api)
            .formParam("#��hCW����lB?N�_	J������2K", """:�@A�ƽ�ft�!��N��Bp���>��2U����#_�Q���$L� ��9�[��#�ĈQ����[����}�4�������)�
          c;F�QW��>�g�>�Z�8�BH����N*���f���N��g61�{��X�H���rX��^�2r���ŋp���S�DF?�q�e!ʓ](���*'ٵ�9��M�[�h��IQ_��n�|G��
          pg�n2 �f�7�
          ͂��F���h(Zv�V/���^x�Q
          ��,�@Cۅ5�������Y�4Gq���`�����Aa��2�5�ߤ���7Hd�;���
          e��CG��6|�z��pL��6�_-`�����8 �Vv�;""")
        )
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
