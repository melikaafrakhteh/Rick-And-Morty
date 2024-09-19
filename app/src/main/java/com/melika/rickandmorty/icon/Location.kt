package com.melika.rickandmorty.icon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path

val Icons.Location: ImageVector
    get() {
        if (location != null) {
            return location!!
        }
        location = materialIcon(name = "Location") {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 27.2f)
                curveTo(12.0f, 46.4f, 32.0f, 56.0f, 32.0f, 56.0f)
                reflectiveCurveToRelative(20.0f, -9.6f, 20.0f, -28.8f)
                curveTo(52.0f, 16.6f, 43.05f, 8.0f, 32.0f, 8.0f)
                reflectiveCurveToRelative(-20.0f, 8.6f, -20.0f, 19.2f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 26.88f)
                moveToRelative(-6.88f, 0.0f)
                arcToRelative(6.88f, 6.88f, 0.0f, true, true, 13.76f, 0.0f)
                arcToRelative(6.88f, 6.88f, 0.0f, true, true, -13.76f, 0.0f)
            }
        }

        return location!!
    }

private var location: ImageVector? = null