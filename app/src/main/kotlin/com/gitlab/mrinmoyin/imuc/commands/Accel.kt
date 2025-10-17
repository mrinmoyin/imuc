package com.gitlab.mrinmoyin.imuc.commands

import com.github.ajalt.clikt.command.SuspendingCliktCommand
import com.github.ajalt.clikt.core.Context
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.gitlab.mrinmoyin.imuc.t

class Accel : SuspendingCliktCommand() {
    override fun help(context: Context) = "  Calibrate Accelerometer"

    override suspend fun run() {
        t.println("make sure the output is in this format 'x,y,z'")
    }
}
