# Implementación de automatización de pruebas en aplicación móvil

Una empresa de fintech está desarrollando una aplicación móvil para gestionar carteras de inversión. Necesitan garantizar que la aplicación funcione correctamente en diferentes dispositivos y sistemas operativos. Tu tarea es implementar un conjunto de pruebas automatizadas para validar la funcionalidad de la aplicación en Android.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Automatización de pruebas móviles |
| **Nivel** | advanced-l3 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-5 horas |

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

### Fase 1: Configuración del entorno de pruebas

**Objetivo:** Establecer el entorno necesario para ejecutar pruebas automatizadas en la aplicación móvil.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los componentes necesarios para configurar el entorno de pruebas.
- Establece las dependencias y configuraciones iniciales.

**Entregable:** Entorno de pruebas configurado y listo para ejecutar pruebas.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el entorno debe soportar la ejecución de pruebas en Android.
- Verifica que todas las configuraciones sean compatibles con la aplicación a probar.

</details>

### Fase 2: Creación de pruebas automatizadas

**Objetivo:** Desarrollar un conjunto de pruebas automatizadas para validar la funcionalidad principal de la aplicación.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica las funcionalidades clave de la aplicación que necesitan ser probadas.
- Crea pruebas automatizadas para cada funcionalidad identificada.

**Entregable:** Conjunto de pruebas automatizadas que cubren las funcionalidades clave de la aplicación.

<details>
<summary>Pistas de conocimiento</summary>

- Considera diferentes escenarios de uso para cada funcionalidad.
- Asegúrate de que las pruebas sean robustas y puedan ejecutarse en diferentes dispositivos.

</details>

### Fase 3: Ejecución y análisis de resultados

**Objetivo:** Ejecutar las pruebas automatizadas y analizar los resultados para identificar posibles problemas.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Ejecuta el conjunto de pruebas automatizadas en la aplicación.
- Analiza los resultados y documenta cualquier problema encontrado.

**Entregable:** Reporte de resultados de las pruebas con identificación de problemas.

<details>
<summary>Pistas de conocimiento</summary>

- Revisa los logs de las pruebas para obtener información detallada sobre los problemas encontrados.
- Documenta los problemas de manera clara y concisa.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la automatización de pruebas móviles y por qué es importante en el desarrollo de aplicaciones?
- **paraQueSirve**: ¿Para qué sirve la automatización de pruebas en el contexto de una aplicación móvil?
- **comoSeUsa**: ¿Cómo se utilizan las herramientas de automatización de pruebas para validar la funcionalidad de una aplicación móvil?
- **erroresComunes**: ¿Cuáles son algunos errores comunes al implementar pruebas automatizadas en aplicaciones móviles y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de pruebas automatizadas en una aplicación móvil y cómo se pueden justificar?

## Criterios de Evaluacion

- Configuración del entorno de pruebas
- Creación de pruebas automatizadas
- Ejecución y análisis de resultados
- Documentación de problemas encontrados

---

*Reto generado automaticamente por Challenge Generator - Pragma*
