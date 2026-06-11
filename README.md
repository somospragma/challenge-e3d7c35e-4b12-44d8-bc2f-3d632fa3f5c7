# Implementación de un sistema de procesamiento de eventos en tiempo real

Eres un desarrollador backend en una empresa de fintech. Tu tarea es implementar un sistema que procese eventos en tiempo real provenientes de múltiples fuentes, como transacciones de pago y notificaciones de fraude. El sistema debe ser resiliente, escalable y confiable, y debe utilizar programación reactiva para manejar los flujos de eventos. Los eventos provienen de un originador de créditos, un motor antifraude y un buró de riesgos. El sistema debe mantener la consistencia de los datos y garantizar que los eventos se procesen en el orden correcto, incluso en caso de fallos temporales de los servicios externos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del entorno de eventos

**Objetivo:** Configurar un entorno que simule la recepción de eventos en tiempo real desde múltiples fuentes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar y configurar las fuentes de eventos: originador de créditos, motor antifraude y buró de riesgos.
- Establecer un mecanismo para simular la llegada de eventos en tiempo real.
- Garantizar que los eventos se reciban en el orden correcto y se manejen de manera idempotente.

**Entregable:** Entorno simulado que recibe y procesa eventos en tiempo real de múltiples fuentes.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo simular eventos con diferentes tasas de llegada y tipos de datos.
- Piensa en cómo garantizar la idempotencia en la recepción de eventos.

</details>

### Fase 2: Procesamiento de eventos con programación reactiva

**Objetivo:** Implementar el procesamiento de eventos utilizando programación reactiva para manejar flujos de eventos en tiempo real.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Utilizar operadores de Project Reactor para transformar, filtrar y combinar flujos de eventos.
- Garantizar que el sistema sea resiliente y pueda recuperarse de fallos temporales de los servicios externos.
- Mantener la consistencia de los datos y el orden de los eventos durante el procesamiento.

**Entregable:** Sistema que procesa eventos en tiempo real utilizando programación reactiva, garantizando resiliencia y consistencia.

<details>
<summary>Pistas de conocimiento</summary>

- Explora los diferentes operadores de Project Reactor y cómo pueden ser aplicados para transformar y combinar flujos de eventos.
- Considera cómo manejar los fallos temporales de los servicios externos y garantizar la recuperación automática.

</details>

### Fase 3: Escalabilidad y rendimiento del sistema

**Objetivo:** Optimizar el sistema para garantizar su escalabilidad y rendimiento en escenarios de alta carga.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identificar y aplicar técnicas para mejorar la escalabilidad y el rendimiento del sistema.
- Realizar pruebas de carga para evaluar el comportamiento del sistema bajo diferentes niveles de tráfico.
- Ajustar la configuración y la arquitectura del sistema para manejar picos de carga y garantizar un rendimiento óptimo.

**Entregable:** Sistema optimizado para garantizar escalabilidad y rendimiento en escenarios de alta carga.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga técnicas de paralelismo y concurrencia para mejorar la escalabilidad del sistema.
- Considera cómo ajustar la configuración del sistema para manejar picos de carga y garantizar un rendimiento óptimo.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y cómo se aplica en el procesamiento de eventos en tiempo real?
- **paraQueSirve**: ¿Para qué sirve utilizar programación reactiva en el procesamiento de eventos en tiempo real?
- **comoSeUsa**: ¿Cómo se utilizan los operadores de Project Reactor para transformar, filtrar y combinar flujos de eventos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema de procesamiento de eventos en tiempo real utilizando programación reactiva?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización del sistema para garantizar su escalabilidad y rendimiento en escenarios de alta carga?

## Criterios de Evaluacion

- Configuración de un entorno que simule la recepción de eventos en tiempo real desde múltiples fuentes.
- Implementación del procesamiento de eventos utilizando programación reactiva para manejar flujos de eventos en tiempo real.
- Optimización del sistema para garantizar su escalabilidad y rendimiento en escenarios de alta carga.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
