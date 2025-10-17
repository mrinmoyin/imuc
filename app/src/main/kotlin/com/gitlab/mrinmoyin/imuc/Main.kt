package com.gitlab.mrinmoyin.imuc

import com.github.ajalt.clikt.command.SuspendingCliktCommand
import com.github.ajalt.clikt.command.main
import com.github.ajalt.clikt.core.Context
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.github.ajalt.mordant.terminal.Terminal
import com.gitlab.mrinmoyin.imuc.commands.*

val t: Terminal = Terminal()

class IMUC : SuspendingCliktCommand(name = "imuc") {
    override fun help(context: Context) = "IMUC — Calibrate your imu like butter"

    override suspend fun run() = Unit
}

suspend fun main(args: Array<String>) = IMUC().subcommands(Accel()).main(args)
