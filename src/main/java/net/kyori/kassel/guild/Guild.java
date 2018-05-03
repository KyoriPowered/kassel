/*
 * This file is part of kassel, licensed under the MIT License.
 *
 * Copyright (c) 2018 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.kassel.guild;

import net.kyori.kassel.channel.Channel;
import net.kyori.kassel.guild.member.Member;
import net.kyori.kassel.guild.role.Role;
import net.kyori.kassel.snowflake.Snowflake;
import net.kyori.kassel.snowflake.Snowflaked;
import net.kyori.lunar.Named;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Optional;

/**
 * A guild.
 */
public interface Guild extends Named, Snowflaked {
  /**
   * Gets a channel by its snowflake id.
   *
   * @param id the snowflake id
   * @return the channel
   */
  @NonNull Optional<Channel> channel(final @Snowflake long id);

  /**
   * Gets a member by their snowflake id.
   *
   * @param id the snowflake id
   * @return the member
   */
  @NonNull Optional<Member> member(final @Snowflake long id);

  /**
   * Gets a role by its snowflake id.
   *
   * @param id the snowflake id
   * @return the role
   */
  @NonNull Optional<Role> role(final @Snowflake long id);
}
