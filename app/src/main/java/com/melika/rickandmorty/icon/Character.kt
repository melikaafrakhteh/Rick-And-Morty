package com.melika.rickandmorty.icon

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Icons.Character: ImageVector
    get() {
        if (character != null) {
            return character!!
        }
        character = Builder(name = "Character", defaultWidth = 100.0.dp, defaultHeight = 100.0.dp,
                viewportWidth = 100.0f, viewportHeight = 100.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.74f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.96f, 1.2f)
                lineToRelative(4.36f, 21.84f)
                lineToRelative(-19.97f, -3.48f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.98f, 1.58f)
                lineToRelative(14.06f, 19.32f)
                lineTo(5.59f, 45.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.44f, 1.67f)
                lineToRelative(12.22f, 12.22f)
                lineToRelative(-10.25f, 7.69f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.33f, 1.76f)
                lineToRelative(11.83f, 3.38f)
                lineToRelative(-4.99f, 9.14f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.47f)
                lineToRelative(13.1f, -1.63f)
                curveToRelative(0.4f, 1.02f, 0.86f, 2.0f, 1.37f, 2.9f)
                curveTo(33.66f, 91.33f, 41.18f, 95.0f, 48.46f, 95.0f)
                curveToRelative(6.72f, 0.0f, 13.32f, -3.21f, 16.61f, -9.9f)
                lineToRelative(6.64f, 1.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.24f, -1.1f)
                lineToRelative(-0.78f, -5.47f)
                lineToRelative(11.04f, -0.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.81f, -1.44f)
                lineTo(78.9f, 67.7f)
                lineToRelative(9.3f, -4.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.15f, -1.73f)
                lineToRelative(-10.74f, -7.44f)
                lineToRelative(14.37f, -7.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.06f, -1.8f)
                lineToRelative(-15.86f, -7.05f)
                lineToRelative(8.92f, -20.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 83.84f, 16.0f)
                lineToRelative(-23.1f, 5.33f)
                lineTo(59.0f, 2.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.7f, -0.6f)
                lineTo(42.97f, 16.6f)
                lineTo(21.31f, 2.18f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.57f, -0.17f)
                close()
                moveTo(22.21f, 5.17f)
                lineTo(42.54f, 18.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.27f, -0.13f)
                lineTo(57.2f, 5.2f)
                lineToRelative(1.65f, 17.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.22f, 0.88f)
                lineToRelative(22.27f, -5.14f)
                lineToRelative(-8.52f, 19.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.52f, 1.3f)
                lineToRelative(14.87f, 6.62f)
                lineToRelative(-14.0f, 7.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.1f, 1.7f)
                lineToRelative(10.65f, 7.38f)
                lineToRelative(-8.64f, 3.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.48f, 1.36f)
                lineToRelative(4.92f, 9.84f)
                lineToRelative(-10.62f, 0.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.91f, 1.14f)
                lineToRelative(0.72f, 5.03f)
                lineToRelative(-4.89f, -1.27f)
                curveToRelative(0.7f, -1.9f, 1.3f, -3.84f, 1.8f, -5.78f)
                curveToRelative(0.56f, -2.18f, 1.0f, -4.36f, 1.34f, -6.55f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 75.0f, 64.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.0f, -6.7f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.0f, -0.92f, -0.01f, -1.83f, -0.04f, -2.73f)
                verticalLineToRelative(-0.02f)
                arcToRelative(115.7f, 115.7f, 0.0f, false, false, -0.27f, -5.3f)
                curveToRelative(-0.25f, -3.44f, -0.62f, -6.66f, -1.0f, -9.55f)
                arcToRelative(20.03f, 20.03f, 0.0f, false, false, -6.18f, -11.88f)
                arcToRelative(23.82f, 23.82f, 0.0f, false, false, -2.98f, -2.4f)
                arcToRelative(25.13f, 25.13f, 0.0f, false, false, -3.33f, -1.91f)
                arcToRelative(25.45f, 25.45f, 0.0f, false, false, -3.57f, -1.38f)
                arcToRelative(24.68f, 24.68f, 0.0f, false, false, -3.72f, -0.82f)
                curveToRelative(-0.63f, -0.1f, -1.26f, -0.16f, -1.89f, -0.2f)
                curveToRelative(-5.02f, -0.3f, -10.07f, 1.02f, -13.98f, 4.36f)
                arcToRelative(18.72f, 18.72f, 0.0f, false, false, -4.85f, 6.54f)
                curveToRelative(-0.46f, 1.01f, -0.86f, 2.1f, -1.19f, 3.25f)
                arcToRelative(29.94f, 29.94f, 0.0f, false, false, -1.07f, 6.4f)
                lineToRelative(-0.28f, 2.73f)
                curveToRelative(-0.05f, 0.53f, -0.1f, 0.94f, -0.15f, 1.6f)
                lineToRelative(-0.15f, 2.2f)
                curveToRelative(-0.06f, 0.92f, -0.12f, 1.78f, -0.17f, 2.84f)
                lineToRelative(-0.07f, 1.5f)
                lineToRelative(-0.03f, 0.82f)
                lineToRelative(-0.05f, 2.1f)
                verticalLineToRelative(0.3f)
                lineToRelative(-0.01f, 0.56f)
                lineToRelative(-0.01f, 1.06f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.78f, 13.58f)
                curveToRelative(0.42f, 3.05f, 1.01f, 6.0f, 1.9f, 8.68f)
                lineToRelative(-10.7f, 1.34f)
                lineToRelative(4.64f, -8.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.6f, -1.44f)
                lineToRelative(-11.1f, -3.17f)
                lineToRelative(9.56f, -7.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.11f, -1.51f)
                lineTo(7.77f, 47.25f)
                lineToRelative(11.4f, -3.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.53f, -1.55f)
                lineTo(6.26f, 23.96f)
                lineToRelative(18.98f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.15f, -1.18f)
                lineToRelative(-4.18f, -20.9f)
                close()
                moveTo(26.23f, 10.71f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.46f, 0.61f)
                lineToRelative(0.63f, 2.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.98f, -0.22f)
                lineToRelative(-0.64f, -2.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.4f)
                close()
                moveTo(27.57f, 16.51f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.47f, 0.62f)
                lineToRelative(1.6f, 6.96f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.98f, -0.22f)
                lineToRelative(-1.6f, -6.96f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.51f, -0.4f)
                close()
                moveTo(45.18f, 23.01f)
                arcToRelative(23.06f, 23.06f, 0.0f, false, true, 11.67f, 3.04f)
                curveToRelative(0.51f, 0.28f, 1.0f, 0.6f, 1.5f, 0.92f)
                arcToRelative(21.17f, 21.17f, 0.0f, false, true, 5.03f, 4.8f)
                arcToRelative(17.57f, 17.57f, 0.0f, false, true, 3.32f, 8.13f)
                curveToRelative(0.67f, 5.01f, 1.28f, 10.99f, 1.3f, 17.37f)
                lineToRelative(-0.02f, 1.37f)
                curveToRelative(0.0f, 0.67f, -0.02f, 1.35f, -0.04f, 2.03f)
                lineToRelative(-0.04f, 0.83f)
                verticalLineToRelative(0.03f)
                lineToRelative(-0.1f, 2.06f)
                lineToRelative(-0.01f, 0.04f)
                lineToRelative(-0.02f, 0.32f)
                lineToRelative(-0.03f, 0.3f)
                curveToRelative(-0.06f, 0.84f, -0.13f, 1.67f, -0.22f, 2.5f)
                curveToRelative(0.0f, 0.09f, -0.02f, 0.17f, -0.03f, 0.26f)
                curveToRelative(-0.1f, 0.9f, -0.2f, 1.8f, -0.34f, 2.71f)
                arcToRelative(62.77f, 62.77f, 0.0f, false, true, -3.18f, 12.9f)
                curveToRelative(-0.1f, 0.29f, -0.23f, 0.59f, -0.37f, 0.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.02f, 0.04f)
                curveTo(60.76f, 90.02f, 54.78f, 93.0f, 48.47f, 93.0f)
                curveTo(41.86f, 93.0f, 35.0f, 89.64f, 31.5f, 83.41f)
                arcToRelative(23.26f, 23.26f, 0.0f, false, true, -1.85f, -4.33f)
                arcToRelative(33.8f, 33.8f, 0.0f, false, true, -0.68f, -2.32f)
                lineToRelative(-0.1f, -0.42f)
                curveToRelative(-0.11f, -0.43f, -0.21f, -0.86f, -0.3f, -1.3f)
                lineToRelative(-0.05f, -0.19f)
                lineToRelative(-0.16f, -0.8f)
                arcToRelative(57.82f, 57.82f, 0.0f, false, true, -0.86f, -5.84f)
                curveToRelative(-0.05f, -0.46f, -0.08f, -0.93f, -0.12f, -1.4f)
                lineToRelative(-0.15f, -1.8f)
                curveToRelative(-0.05f, -0.86f, -0.09f, -1.7f, -0.12f, -2.56f)
                lineToRelative(-0.04f, -0.67f)
                curveToRelative(-0.03f, -0.89f, -0.04f, -1.77f, -0.05f, -2.63f)
                lineToRelative(-0.01f, -0.58f)
                lineToRelative(0.01f, -2.34f)
                verticalLineToRelative(-0.82f)
                arcToRelative(141.28f, 141.28f, 0.0f, false, true, 0.16f, -4.42f)
                curveToRelative(0.05f, -1.01f, 0.11f, -1.87f, 0.17f, -2.76f)
                lineTo(27.5f, 46.0f)
                lineToRelative(0.17f, -1.82f)
                lineToRelative(0.13f, -1.33f)
                verticalLineToRelative(-0.05f)
                lineToRelative(0.12f, -1.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.06f)
                curveToRelative(0.4f, -6.19f, 2.36f, -10.6f, 5.17f, -13.59f)
                curveToRelative(0.4f, -0.43f, 0.81f, -0.82f, 1.25f, -1.2f)
                arcTo(17.03f, 17.03f, 0.0f, false, true, 45.18f, 23.0f)
                close()
                moveTo(12.68f, 27.05f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.35f, 0.8f)
                lineToRelative(5.13f, 6.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.79f, -0.6f)
                lineToRelative(-5.13f, -6.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.39f, -0.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.05f, 0.0f)
                close()
                moveTo(53.5f, 29.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.14f, 0.02f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, true, -3.37f, 0.74f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.16f, 0.98f)
                curveToRelative(1.16f, -0.18f, 2.33f, -0.43f, 3.49f, -0.76f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.14f, -0.98f)
                close()
                moveTo(38.46f, 30.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.02f, 1.0f)
                reflectiveCurveToRelative(3.83f, 0.48f, 8.53f, 0.12f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.08f, -1.0f)
                curveToRelative(-4.59f, 0.35f, -8.33f, -0.12f, -8.33f, -0.12f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.1f, 0.0f)
                close()
                moveTo(57.31f, 34.9f)
                curveToRelative(-2.02f, 0.02f, -4.21f, 0.25f, -6.55f, 0.5f)
                curveToRelative(-5.1f, 0.54f, -10.84f, 1.13f, -17.38f, 0.13f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.76f, 4.94f)
                curveToRelative(2.84f, 0.44f, 5.56f, 0.6f, 8.12f, 0.6f)
                curveToRelative(3.92f, 0.0f, 7.47f, -0.38f, 10.54f, -0.7f)
                curveToRelative(4.18f, -0.44f, 7.77f, -0.77f, 9.87f, -0.01f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.69f, -4.7f)
                curveToRelative(-1.66f, -0.61f, -3.51f, -0.8f, -5.53f, -0.77f)
                close()
                moveTo(57.31f, 35.9f)
                curveToRelative(1.95f, -0.02f, 3.7f, 0.15f, 5.2f, 0.69f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.9f, 1.92f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.92f, 0.9f)
                curveToRelative(-2.5f, -0.9f, -6.13f, -0.47f, -10.31f, -0.03f)
                curveToRelative(-3.08f, 0.32f, -6.59f, 0.69f, -10.44f, 0.69f)
                curveToRelative(-2.52f, 0.0f, -5.18f, -0.16f, -7.97f, -0.59f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.45f, -2.96f)
                curveToRelative(6.7f, 1.02f, 12.54f, 0.41f, 17.65f, -0.13f)
                curveToRelative(2.33f, -0.24f, 4.5f, -0.46f, 6.44f, -0.49f)
                close()
                moveTo(19.83f, 36.37f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.36f, 0.81f)
                lineToRelative(2.05f, 2.68f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.8f, -0.61f)
                lineToRelative(-2.06f, -2.68f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.43f, -0.2f)
                close()
                moveTo(34.23f, 42.84f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.27f, 0.08f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, false, -3.94f, 6.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.02f, 0.18f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, 6.6f, 8.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.01f, 0.0f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, false, 9.85f, -8.09f)
                curveToRelative(0.0f, -0.42f, -0.05f, -0.83f, -0.12f, -1.22f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.07f, -0.3f)
                arcTo(8.25f, 8.25f, 0.0f, false, false, 43.0f, 43.23f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.57f, 0.81f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, 2.8f, 4.43f)
                arcToRelative(34.48f, 34.48f, 0.0f, false, false, -6.54f, -0.46f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.19f, -0.01f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.23f, 0.02f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(-2.32f, 0.1f, -4.65f, 0.43f, -6.99f, 0.99f)
                arcToRelative(7.18f, 7.18f, 0.0f, false, true, 3.27f, -5.24f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.25f, -0.93f)
                close()
                moveTo(53.23f, 42.84f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.27f, 0.08f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, false, -3.94f, 6.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.02f, 0.18f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, 6.6f, 8.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.01f, 0.0f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, false, 9.85f, -8.09f)
                curveToRelative(0.0f, -0.42f, -0.05f, -0.83f, -0.12f, -1.22f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.07f, -0.3f)
                arcTo(8.25f, 8.25f, 0.0f, false, false, 62.0f, 43.23f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.57f, 0.81f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, 2.8f, 4.43f)
                arcToRelative(34.48f, 34.48f, 0.0f, false, false, -6.54f, -0.46f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.19f, -0.01f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.23f, 0.02f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(-2.32f, 0.1f, -4.65f, 0.43f, -6.99f, 0.99f)
                arcToRelative(7.18f, 7.18f, 0.0f, false, true, 3.27f, -5.24f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.25f, -0.93f)
                close()
                moveTo(40.03f, 49.0f)
                curveToRelative(1.8f, 0.04f, 3.58f, 0.23f, 5.36f, 0.54f)
                curveToRelative(0.05f, 0.34f, 0.11f, 0.68f, 0.11f, 1.02f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, true, -14.31f, 1.66f)
                arcToRelative(7.21f, 7.21f, 0.0f, false, true, -0.11f, -2.12f)
                curveToRelative(2.0f, -0.5f, 3.99f, -0.84f, 5.97f, -1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 38.5f, 51.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.41f, -2.0f)
                horizontalLineToRelative(0.12f)
                close()
                moveTo(59.03f, 49.0f)
                curveToRelative(1.8f, 0.04f, 3.58f, 0.23f, 5.36f, 0.54f)
                curveToRelative(0.05f, 0.34f, 0.11f, 0.68f, 0.11f, 1.02f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, true, -14.31f, 1.66f)
                arcToRelative(7.21f, 7.21f, 0.0f, false, true, -0.11f, -2.12f)
                curveToRelative(2.0f, -0.5f, 3.99f, -0.84f, 5.97f, -1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 57.5f, 51.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.41f, -2.0f)
                horizontalLineToRelative(0.12f)
                close()
                moveTo(44.5f, 59.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.49f, 0.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.33f, 0.33f, 2.38f, 0.88f, 3.11f)
                arcTo(2.68f, 2.68f, 0.0f, false, false, 47.0f, 69.75f)
                curveToRelative(0.8f, 0.0f, 1.57f, -0.4f, 2.12f, -1.14f)
                curveToRelative(0.55f, -0.73f, 0.88f, -1.78f, 0.88f, -3.11f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.17f, -0.3f, 2.0f, -0.68f, 2.51f)
                curveToRelative(-0.39f, 0.52f, -0.86f, 0.74f, -1.32f, 0.74f)
                curveToRelative(-0.46f, 0.0f, -0.93f, -0.22f, -1.32f, -0.74f)
                arcTo(4.16f, 4.16f, 0.0f, false, true, 45.0f, 65.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(25.03f, 59.5f)
                curveToRelative(0.04f, 2.98f, 0.17f, 6.09f, 0.5f, 9.17f)
                arcTo(4.9f, 4.9f, 0.0f, false, true, 22.0f, 64.0f)
                arcToRelative(4.91f, 4.91f, 0.0f, false, true, 3.02f, -4.5f)
                close()
                moveTo(69.99f, 59.5f)
                arcTo(4.91f, 4.91f, 0.0f, false, true, 73.0f, 64.0f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -3.67f, 4.71f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.25f, -1.93f, 0.42f, -3.85f, 0.52f, -5.75f)
                verticalLineToRelative(-0.04f)
                lineToRelative(0.03f, -0.56f)
                lineToRelative(0.1f, -2.3f)
                verticalLineToRelative(-0.53f)
                close()
                moveTo(31.82f, 59.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.3f, 0.87f)
                reflectiveCurveToRelative(3.92f, 3.5f, 9.18f, 1.4f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.38f, -0.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.14f, -1.21f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.36f, -0.13f)
                close()
                moveTo(62.52f, 59.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.34f, 0.13f)
                reflectiveCurveToRelative(-3.4f, 3.1f, -8.14f, 1.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.38f, 0.93f)
                arcToRelative(9.2f, 9.2f, 0.0f, false, false, 9.18f, -1.39f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.31f, -0.87f)
                close()
                moveTo(46.89f, 76.78f)
                curveToRelative(-6.77f, 0.07f, -11.59f, 2.26f, -11.59f, 2.26f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.42f, 0.92f)
                reflectiveCurveToRelative(10.8f, -4.91f, 22.6f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.38f, -0.92f)
                arcToRelative(29.36f, 29.36f, 0.0f, false, false, -11.81f, -2.26f)
                close()
            }
        }
        .build()
        return character!!
    }

private var character: ImageVector? = null
